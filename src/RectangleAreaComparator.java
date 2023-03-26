import java.util.Comparator;

public class RectangleAreaComparator implements Comparator<Rectangle> {
  @Override
  public int compare(Rectangle rect1, Rectangle rect2) {
    int areaRect1 = rect1.getSideA() * rect1.getSideB();
    int areaRect2 = rect2.getSideA() * rect2.getSideB();
    return areaRect1 - areaRect2;
  }
}
