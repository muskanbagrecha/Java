package src.LLD.interview.pubsubsystem.publisher;

import src.LLD.interview.pubsubsystem.Topic;

public interface Publisher {
    void addTopic(Topic topic);
    void publish(Topic topic, String message);
}
