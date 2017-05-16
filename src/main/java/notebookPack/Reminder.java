package notebookPack;

public class Reminder extends Note {
    private String time;

    Reminder(String pNote) {
        this.time = "TheTime";
        this.setNote(pNote);
    }

    private String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + getTime() + '\'' +
                ", firstName='" + getNote() + '\'' +
                '}';
    }
}
