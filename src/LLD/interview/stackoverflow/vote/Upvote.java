package src.LLD.interview.stackoverflow.vote;

import src.LLD.interview.stackoverflow.user.User;

public class Upvote extends Vote{
    public Upvote(User user) {
        super(user);
        this.voteType = "UPVOTE";
    }

    @Override
    String getVoteType() {
        return this.voteType;
    }
}
