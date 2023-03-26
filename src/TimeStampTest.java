import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeStampTest{

  @Test
  public void hoursSet(){
  TimeStamp time1 = new TimeStamp(1, 0);
    assertEquals(1, time1.getHours());

    time1.setHours(0);
    assertEquals(0, time1.getHours());

    time1.setHours(24);
    assertEquals(0, time1.getHours());

    time1.setHours(25);
    assertEquals(1, time1.getHours());
  }

  @Test
  public void minutesSet(){
    TimeStamp time1 = new TimeStamp(0, 1);
    assertEquals(1, time1.getMinutes());

    time1.setMinutes(0);
    assertEquals(0, time1.getMinutes());

    time1.setMinutes(60);
    assertEquals(0, time1.getMinutes());

    time1.setMinutes(61);
    assertEquals(1, time1.getMinutes());
  }

  @Test
  public void hoursAdd(){
    TimeStamp time1 = new TimeStamp(0, 0);
    time1.addHours(0);
    assertEquals(0, time1.getHours());

    time1.addHours(10);
    assertEquals(10, time1.getHours());

    time1.addHours(14);
    assertEquals(0, time1.getHours());
  }

  @Test
  public void minutesAdd(){
    TimeStamp time1 = new TimeStamp(0, 0);
    time1.addMinutes(0);
    assertEquals(0, time1.getMinutes());

    time1.addMinutes(30);
    assertEquals(30, time1.getMinutes());

    time1.addMinutes(30);
    assertEquals(0, time1.getMinutes());
    assertEquals(1, time1.getHours());
  }

  @Test
  public void compareTime(){
    TimeStamp time1 = new TimeStamp(0, 0);
    TimeStamp time2 = new TimeStamp(0, 0);
    assertTrue(time1.compareTo(time2) == 0 );

    TimeStamp time3 = new TimeStamp(0, 1);
    assertTrue(time1.compareTo(time3) < 0 );
    assertTrue(time3.compareTo(time1) > 0 );

    TimeStamp time4 = new TimeStamp(1, 0);
    assertTrue(time1.compareTo(time4) < 0 );
    assertTrue(time4.compareTo(time1) > 0 );


    assertTrue(time3.compareTo(time4) < 0 );
    assertTrue(time4.compareTo(time3) > 0 );

    TimeStamp time5 = new TimeStamp(5, 25);
    TimeStamp time6 = new TimeStamp(5, 25);
    assertTrue(time5.compareTo(time6) == 0 );
  }
}
