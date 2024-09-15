package src.LLD.interview.pubsubsystem;

import src.LLD.interview.pubsubsystem.publisher.Publisher;
import src.LLD.interview.pubsubsystem.publisher.PublisherImpl;
import src.LLD.interview.pubsubsystem.subscriber.Subscriber;
import src.LLD.interview.pubsubsystem.subscriber.SubscriberImpl;

import java.util.List;

public class PubSubSystem {
    public static void main(String[] args){
        Topic topic1 = new Topic("Orders");
        Publisher publisher = new PublisherImpl();
        Subscriber subscriber1 = new SubscriberImpl();
        Subscriber subscriber2 = new SubscriberImpl();
        publisher.addTopic(topic1);
        Topic topic2 = new Topic("Topic 2");
        publisher.addTopic(topic2);
        subscriber1.subscribe(topic1);
        subscriber2.subscribe(topic2);
        subscriber2.unsubscribe(topic2);
        publisher.publish(topic2, "Placed order 1");
    }

}
