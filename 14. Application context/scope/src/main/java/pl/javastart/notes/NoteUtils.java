package pl.javastart.notes;

public class NoteUtils {
    static final String PRIVATE_PATH = "private";
    static final String PUBLIC_PATH = "public";

    public static String buildNoteUrl(Note note) {
        if (note.getType().equals(Note.PRIVATE_TYPE)) {
            return String.format("%s?id=%s", PRIVATE_PATH, note.getId());
        } else if (note.getType().equals(Note.PUBLIC_TYPE)) {
            return String.format("%s?id=%s", PUBLIC_PATH, note.getId());
        } else {
            throw new IllegalArgumentException("Invalid note scope " + note.getType());
        }
    }
}
