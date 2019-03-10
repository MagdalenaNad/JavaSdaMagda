package weekend03.dates;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime myBirthsday=LocalDateTime.of(1987, 8,20, 06, 47);
        System.out.println("Urodziłam się: " + myBirthsday);

        String myBirthsdayDate=myBirthsday.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
        DayOfWeek dayOfWeek=myBirthsday.getDayOfWeek();
        System.out.println(myBirthsdayDate +", " + dayOfWeek);

        ZoneId zoneId =ZoneId.of("Japan");
        ZonedDateTime myJapanBirthsday=myBirthsday.atZone(zoneId);
        System.out.println(myJapanBirthsday); // poprawić!!!!!!
    }
}
