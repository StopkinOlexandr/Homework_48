import java.util.Objects;

//Задача 1.
// Создать класс Rectangle (прямоугольник), которому в конструкторе нужно передавать длину и ширину.
//
// Написать компаратор, который сравнивает прямоугольники по площади.
//
// Написать тесты для этого компаратора.
public class Rectangle {
  private int sideA;
  private int sideB;

  public int getSideA() {
    return sideA;
  }

  public void setSideA(int sideA) {
    this.sideA = sideA;
  }

  public int getSideB() {
    return sideB;
  }

  public void setSideB(int sideB) {
    this.sideB = sideB;
  }

  public Rectangle(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideA = sideB;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "sideA=" + sideA +
        ", sideB=" + sideB +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return (sideA == rectangle.sideA && sideB == rectangle.sideB) ||
        (sideA == rectangle.sideB && sideB == rectangle.sideA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sideA, sideB);
  }
}
