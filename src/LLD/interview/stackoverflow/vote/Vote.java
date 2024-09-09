package src.LLD.interview.stackoverflow.vote;


import src.LLD.interview.stackoverflow.user.User;

public abstract class Vote {
    private User user;
    protected String voteType;

    public Vote(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    abstract String getVoteType();
}

