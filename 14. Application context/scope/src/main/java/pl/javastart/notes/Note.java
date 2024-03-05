package pl.javastart.notes;

public class Note {
    static final String PRIVATE_TYPE = "private";
    static final String PUBLIC_TYPE = "public";

    private String id;
    private String content;
    private String type;

    public Note(String id, String content, String type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}
