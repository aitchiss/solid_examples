import java.util.ArrayList;

public class Scrapbook implements RecordKeeper{

  private ArrayList<String> journalEntries;

  public Scrapbook(){
    journalEntries = new ArrayList<String>();
    int numberOfPictures = 0;
  }

  public void write(String text){
    this.journalEntries.add(text);
  }

  public String readLast(){
    return journalEntries.get(journalEntries.size() - 1);
  }
}