package src.LLD.interview.stackoverflow.post;

import src.LLD.interview.stackoverflow.user.User;

public class Answer extends Post {
    private boolean isAccepted;

    public Answer(String id, String content, User author) {
        super(id, content, author);
        this.isAccepted = false;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
