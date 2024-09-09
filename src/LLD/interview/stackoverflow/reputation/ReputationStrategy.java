package src.LLD.interview.stackoverflow.reputation;

import src.LLD.interview.stackoverflow.post.Answer;
import src.LLD.interview.stackoverflow.post.Post;

public interface ReputationStrategy {
    void addReputationForUpvotes(Post post);
    void addReputationForAcceptedAnswer(Answer answer);
}
