package src.LLD.interview.pubsubsystem;

import src.LLD.interview.pubsubsystem.subscriber.Subscriber;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Topic {
    private Set<Subscriber> subscribers;
    private String topicName;
    ExecutorService executorService;
    private static int RETRY = 3;

    public Topic(String topicName) {
        this.subscribers = new CopyOnWriteArraySet<>();
        this.topicName = topicName;
        this.executorService = Executors.newCachedThreadPool();
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void publishMessage(Message message){
        notifySubscribers(message);
    }

    public void notifySubscribers(Message message){
        for(Subscriber subscriber : subscribers){
            executorService.submit(() -> notifyWithRetry(subscriber, message));
        }
    }

    public void notifyWithRetry(Subscriber subscriber, Message message){
        int currentRetries = RETRY;
        boolean isSuccess = false;
        while (currentRetries>0){
            try{
                subscriber.action(this, message);
                isSuccess = true;
            }
            catch (Exception e){
                currentRetries++;
            }
        }
        if(!isSuccess){
            System.out.println("Failed to notify subscriber" + subscriber +" exceeded retries");
        }
    }

    public String getTopicName() {
        return topicName;
    }

}
