import java.util.ArrayList;

public class Journal{

  private ArrayList<String> journalEntries;

  public Journal(){
    journalEntries = new ArrayList<String>();
  }

  public void add(String entry){
    journalEntries.add(entry);
  }

  public String getEntry(int index){
    return journalEntries.get(index);
  }

  public String getLastEntry(){
    return getEntry(journalEntries.size() - 1);
  }
}