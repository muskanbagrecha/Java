package src.LLD.interview.stackoverflow.post;

import src.LLD.interview.stackoverflow.user.User;

public class Comment {
    private String id;
    private String content;
    private User author;

    public Comment(String id, String content, User author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
