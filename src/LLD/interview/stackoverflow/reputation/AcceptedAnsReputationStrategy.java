package src.LLD.interview.stackoverflow.reputation;

import src.LLD.interview.stackoverflow.post.Answer;
import src.LLD.interview.stackoverflow.post.Post;

public class AcceptedAnsReputationStrategy implements ReputationStrategy{
    @Override
    public void addReputationForUpvotes(Post post) {
    }

    @Override
    public void addReputationForAcceptedAnswer(Answer answer) {
        answer.getAuthor().addReputation(100);
        System.out.println("Added reputation points for user " + answer.getAuthor().getUsername() + " for correct ans. Total reputation points: " + answer.getAuthor().getReputation());
    }
}
