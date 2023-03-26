public class TimeStamp {
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
    int a = getHours();
    int b = a - hours;
    int c = b % 24;
    setHours(getHours() + hours);
  }

  @Override
  public String toString() {
    return "TimeStamp{" +
        "hours=" + hours +
        ", minutes=" + minutes +
        '}';
  }
}
