import java.util.ArrayList;

public class Diary implements RecordKeeper{

  // Diary knows how to create, store and access journal entries.
  // Any class that makes use of Diary doesn't need to be concerned with how this is done.

  private ArrayList<String> journalEntries;

  public Diary(){
    journalEntries = new ArrayList<String>();
  }

  public void write(String text){
    this.journalEntries.add(text);
  }

  public String readLast(){
    return journalEntries.get(journalEntries.size() - 1);
  }
}