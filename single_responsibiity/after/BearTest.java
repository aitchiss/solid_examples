import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

  Bear bear;
  Salmon food;

  @Before
  public void setup(){
    bear = new Bear();
    food = new Salmon();
  }

  @Test
  public void canEatSalmon(){
    bear.eat(food);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void cantEatIfBellyFull(){
    for (int i = 0; i < 7; i++){
      bear.eat(food);
    }
    assertEquals(5, bear.foodCount());
  }

  @Test
  public void canWriteJournalEntry(){
    bear.eat(food);
    bear.getJournal().add("Dear Diary, I ate " + bear.foodCount() + " salmon today.");
    assertEquals("Dear Diary, I ate 1 salmon today.", bear.getJournal().getLastEntry());
  }

}