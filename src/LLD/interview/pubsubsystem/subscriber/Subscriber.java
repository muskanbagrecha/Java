package src.LLD.interview.pubsubsystem.subscriber;

import src.LLD.interview.pubsubsystem.Message;
import src.LLD.interview.pubsubsystem.Topic;

public interface Subscriber {
    void subscribe(Topic topic);
    void unsubscribe(Topic topic);
    void action(Topic topic, Message message);
}
