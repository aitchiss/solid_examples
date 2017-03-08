import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class CircusBearTest{
  CircusBear circusBear;
  Salmon salmon;
  Steak steak;
  TopHat tophat;

  @Before
  public void before(){
    circusBear = new CircusBear();
    salmon = new Salmon();
    steak = new Steak();
    tophat = new TopHat();
  }

  @Test
  public void canEat(){
    circusBear.eat(salmon);
    assertEquals(1, circusBear.foodCount());
  }

  @Test
  public void cannotEatWhenBellyFull(){
    for (int i = 0; i < 12; i++){
      circusBear.eat(salmon);
    }
    assertEquals(10, circusBear.foodCount());
  }

  @Test
  public void canEatSteak(){
    // This will cause a compilation error
    circusBear.eat(steak);
    assertEquals(1,circusBear.foodCount());
  }

  @Test
  public void canteatTopHat(){
    circusBear.eat(tophat);

  }
}