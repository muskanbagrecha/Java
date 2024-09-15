package src.LLD.interview.pubsubsystem.publisher;

import src.LLD.interview.pubsubsystem.Message;
import src.LLD.interview.pubsubsystem.Topic;

import java.util.HashSet;
import java.util.Set;

public class PublisherImpl implements Publisher {
    private Set<Topic> topics;

    public PublisherImpl() {
        this.topics = new HashSet<>();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    @Override
    public void publish(Topic topic, String message) {
        addTopic(topic);
        topic.publishMessage(new Message(message));
    }
}
