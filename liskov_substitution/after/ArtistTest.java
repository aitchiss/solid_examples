import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ArtistTest {
  Artist artist;
  Square square;
  Circle circle;
  Triangle triangle;

  @Before
  public void before(){
    artist = new Artist();
    square = new Square();
    circle = new Circle();
    triangle = new Triangle();
  }

  @Test
  public void canDrawSquare(){
    assertEquals("I'm drawing a Square!", artist.drawShape(square));
  }

  @Test
  public void canDrawCircle(){
    assertEquals("I'm drawing a Circle!", artist.drawShape(circle));
  }

  @Test
  public void canDrawTriangle(){
    assertEquals("I'm drawing a Triangle!", artist.drawShape(triangle));
  }
}