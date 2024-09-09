package src.LLD.interview.stackoverflow.reputation;

import src.LLD.interview.stackoverflow.post.Answer;
import src.LLD.interview.stackoverflow.post.Post;

public class UpvotesReputationStrategy implements ReputationStrategy{
    @Override
    public void addReputationForUpvotes(Post post) {
        post.getAuthor().addReputation(10);
        System.out.println("Added reputation points for user " + post.getAuthor().getUsername() + " for getting upvotes. Total reputation points: " + post.getAuthor().getReputation());
    }

    @Override
    public void addReputationForAcceptedAnswer(Answer answer) {
    }
}
