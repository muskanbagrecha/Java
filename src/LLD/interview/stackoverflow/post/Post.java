package src.LLD.interview.stackoverflow.post;

import src.LLD.interview.stackoverflow.user.User;
import src.LLD.interview.stackoverflow.vote.Downvote;
import src.LLD.interview.stackoverflow.vote.Upvote;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {
    private String id;
    private String content;
    private User author;
    private Map<String, Upvote> upvotes;
    private Map<String, Downvote> downvotes;
    private LocalDateTime createdAt;
    private List<Comment> comments;

    public Post(String id, String content, User author) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.upvotes = new HashMap<>();
        this.downvotes = new HashMap<>();
        createdAt = LocalDateTime.now();
        this.comments = new ArrayList<>();
    }

    public void addUpvote(Upvote upvote){
        upvotes.put(upvote.getUser().getUserId(), upvote);
    }

    public void addDownvote(Downvote downvote){
        downvotes.put(downvote.getUser().getUserId(), downvote);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Map<String, Upvote> getUpvotes() {
        return upvotes;
    }

    public Map<String, Downvote> getDownvotes() {
        return downvotes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public boolean containsText(String text){
        return content.contains(text);
    }

    public boolean addComment(Comment comment){
        comments.add(comment);
        return true;
    }

    public boolean removeComment(String commentId){
        List<Comment> updatedComments = comments.stream()
                .filter(comment -> !comment.getId().equals(commentId))
                .toList();
        this.comments = updatedComments;
        return true;
    }
}
