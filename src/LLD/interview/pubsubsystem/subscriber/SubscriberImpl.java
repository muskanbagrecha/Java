package src.LLD.interview.pubsubsystem.subscriber;

import src.LLD.interview.pubsubsystem.Message;
import src.LLD.interview.pubsubsystem.Topic;

public class SubscriberImpl implements Subscriber{
    @Override
    public void subscribe(Topic topic) {
        topic.addSubscriber(this);
    }

    @Override
    public void unsubscribe(Topic topic) {
        topic.removeSubscriber(this);
    }

    @Override
    public void action(Topic topic, Message message) {
        System.out.println("Subscriber taking some action on::" + message.getMessage() + " " + topic.getTopicName());
    }
}
