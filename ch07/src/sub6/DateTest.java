package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) {
    // Using Date class
    Date date = new Date();
    System.out.println(date); // Same as System.out.println(date.toString());

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String res = formatter.format(date);
    System.out.println(res);

    // Calendar class
    Calendar cal = Calendar.getInstance();

    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH) + 1;
    int dt = cal.get(Calendar.DATE);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);

    System.out.printf("%d-0%d-%d %d:%d:%d", year, month, dt, hour, min, sec);
  }
}
