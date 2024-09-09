package src.LLD.interview.stackoverflow.tag;

import java.util.UUID;

public class Tag {
    private UUID tagId;
    private String text;

    public Tag(String text) {
        this.tagId = UUID.randomUUID();
        this.text = text;
    }

    public UUID getTagId() {
        return tagId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
