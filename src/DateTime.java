import java.sql.SQLOutput;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        // for finding the time and date in java (java store time in milliseconds)
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        // double variable is safe for storing miles second in java
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        // Date class
        Date E = new Date();
        System.out.println(E);
                Calendar c = Calendar.getInstance();
                System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar
        System.out.println(c.getTimeZone().getID());




                System.out.println(c.getTime());
                System.out.println(c.get(Calendar.DATE));
                System.out.println(c.get(Calendar.SECOND));
                System.out.println(c.get(Calendar.HOUR));
                System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
                GregorianCalendar cal = new GregorianCalendar();
                System.out.println(cal.isLeapYear(2018));
                System.out.println(TimeZone.getAvailableIDs()[0]);
                System.out.println(TimeZone.getAvailableIDs()[1]);
                System.out.println(TimeZone.getAvailableIDs()[2]);

                //local time
                LocalDate d = LocalDate.now();
                System.out.println(d);

                LocalTime t = LocalTime.now();
                System.out.println(t);

                // LOCAL DATE TIME FORMATTER

                LocalDateTime dt = LocalDateTime.now(); // This is the date
                System.out.println(dt);

                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
                DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

                String myDate = dt.format(df); // Creating date string using date and format
                System.out.println(myDate);

            }
        }



