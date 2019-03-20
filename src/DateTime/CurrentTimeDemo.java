package DateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class CurrentTimeDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate today=LocalDate.now();
        LocalDate tomorrow=today.plusDays(1);
        LocalDate yesterday=today.minusDays(1);
        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);

        LocalDate year=LocalDate.of(2016,1,1);
        System.out.println(year.isLeapYear());



    }
}
