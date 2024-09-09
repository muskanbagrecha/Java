package src.LLD.interview.stackoverflow.post;

import src.LLD.interview.stackoverflow.tag.Tag;
import src.LLD.interview.stackoverflow.user.User;

import java.util.*;
import java.util.stream.Collectors;

public class Question extends Post {
    private String title;
    private List<Tag> tags;
    private Map<String, Answer> answers;

    public Question(String id, String title, String content, User author,List<Tag> tags) {
        super(id, content, author);
        this.title = title;
        this.tags = tags;
        this.answers = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Map<String, Answer> getAnswers() {
        return answers;
    }

    public boolean hasTag(String searchTag){
        Set<String> allTags = this.tags.stream().map(Tag::getText).collect(Collectors.toSet());
        return allTags.contains(searchTag);
    }

    public void addAnswer(Answer answer){
        this.answers.put(answer.getId(), answer);
    }
}
