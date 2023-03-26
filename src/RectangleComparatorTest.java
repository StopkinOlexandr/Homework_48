
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;

public class RectangleComparatorTest {
  private final Comparator<Rectangle> comparator = new RectangleAreaComparator();

  @Test
  public void areaRectZero(){
    Rectangle rect1 = new Rectangle(0, 0);
    Rectangle rect2 = new Rectangle(0, 0);

    int result1 = comparator.compare(rect1, rect2);
    int result2 = comparator.compare(rect2, rect1);

    assertEquals(0, result1);
    assertEquals(0, result2);
  }

  @Test
  public void rect1NotEqualRect2(){
    Rectangle rect1 = new Rectangle(4, 5);
    Rectangle rect2 = new Rectangle(4, 3);

    int result1 = comparator.compare(rect1, rect2);
    int result2 = comparator.compare(rect2, rect1);

    assertTrue(result1 > 0);
    assertTrue(result2 < 0);
  }

  @Test
  public void rect1Rect2Zero(){
    Rectangle rect1 = new Rectangle(4, 5);
    Rectangle rect2 = new Rectangle(0, 0);

    int result1 = comparator.compare(rect1, rect2);
    int result2 = comparator.compare(rect2, rect1);

    assertTrue(result1 > 0);
    assertTrue(result2 < 0);
  }

  @Test
  public void rect1EqualRect2(){
    Rectangle rect1 = new Rectangle(4, 5);
    Rectangle rect2 = new Rectangle(4, 5);

    int result1 = comparator.compare(rect1, rect2);
    int result2 = comparator.compare(rect2, rect1);

    assertEquals(0, result1);
    assertEquals(0, result2);
  }


}
