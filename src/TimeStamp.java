// Задача 2* (не обязательно).
// Создать класс Timestamp для хранения отметки времени (точки "часы:минуты").
//
// У класса должны быть методы "добавить часы" и "добавить минуты",
// принимающий количество часов (или минут) для добавления.
//
// В классе должен быть реализован интерфейс Comparable,
// который бы сравнивал отметки времени (раньше - меньше, позже - больше).
//
// Примечание:
// считаем, что корректные отметки времени находятся только в диапазоне от 00:00 до 23:59
//
// Попытка добавить 1 минуту к отметке 23:59 должна приводить к установке времени на отметку 00:00.

public class TimeStamp implements Comparable<TimeStamp>{
  private int hours = 0;
  private int minutes = 0;

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours % 24;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes % 60;
    setHours (minutes / 60);
    }

  public TimeStamp(int hours, int minutes) {
    setMinutes(minutes);
    setHours(hours);
  }

  public void addMinutes(int minutes){
    setMinutes(getMinutes() + minutes);
  }

  public void addHours(int hours){
   setHours(getHours() + hours);
  }

  @Override
  public String toString() {
    return "TimeStamp{" +
        "hours=" + hours +
        ", minutes=" + minutes +
        '}';
  }

  @Override
  public int compareTo(TimeStamp otherTime) {
    int time1 = getHours() * 24 + getMinutes();
    int time2 = otherTime.getHours() * 24 + otherTime.getMinutes();
    return time1 - time2;
  }

}
