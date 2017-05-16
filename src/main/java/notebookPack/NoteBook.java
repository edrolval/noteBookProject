package notebookPack;

import asg.cliche.Command;
import java.util.ArrayList;
import java.util.Arrays;

public class NoteBook {
    private ArrayList<Record> records = new ArrayList<>();
    private ArrayList<Note> notes = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;
    }

    @Command
    public Record createPerson
             (String pFirstName
             ,String pLastName
             ,String pNote
             ,String... pPhone) {

//            ,String pMail
//            ,String pAddress
//        records.size(); // Not used just because

        Person result = new Person
                        (pFirstName
                        ,pLastName
                        ,pNote
                        ,new ArrayList<>(Arrays.asList(pPhone)));
        records.add(result);
        return result;
    }

    @Command
    public Note addNote (String pNote) {
        Reminder result = new Reminder(pNote);
        notes.add(result);
        return result;
    }
}
