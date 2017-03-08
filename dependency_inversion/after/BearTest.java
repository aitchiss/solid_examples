import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

  Bear bear;
  Diary diary;
  Scrapbook scrapbook;

  @Before
  public void setup(){
    diary = new Diary();
    bear = new Bear(diary);
    scrapbook = new Scrapbook();
  }

  @Test
  public void hasJournal(){
    bear.getJournal().write("Dear diary, mood: apathetic...");
    assertEquals("Dear diary, mood: apathetic...", bear.getJournal().readLast());
  }

  @Test
  public void hasScrapbook(){
    bear = new Bear(scrapbook);
    bear.getJournal().write("Dear diary, mood: apathetic...");
    assertEquals("Dear diary, mood: apathetic...", bear.getJournal().readLast());
  }

}