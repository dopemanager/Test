package src1;

import java.time.Instant;

public class Note {
    private final String name;
    private String text;
    private final String avtor;
    private final Instant creationDate;
    private Instant updateDate;

    public Note(String name, String text) {
        this.name = name;
        this.text = text;
        this.avtor = null;
        this.creationDate = Instant.now();
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public String getAvtor() {
        return this.avtor;
    }

    public Instant getCreationDate() {
        return this.creationDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }
}
