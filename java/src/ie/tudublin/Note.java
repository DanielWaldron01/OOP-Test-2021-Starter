package ie.tudublin;

import javax.swing.text.TableView.TableRow;

public class Note {
    private char note;
    private int duration;


    public Star()
    {

    }

    public Note(TableRow row)
    {
        //constructor chaining
        this(
            row.getChar("Note"),
            row.getInt("Duration")
        );
    }

    //constructors
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }

}
