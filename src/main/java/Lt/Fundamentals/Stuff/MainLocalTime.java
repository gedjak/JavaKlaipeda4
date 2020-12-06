package Lt.Fundamentals.Stuff;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainLocalTime {
    public static void main(String[] args) {
       LocalTime laikas = LocalTime.now();
        System.out.println(laikas);
        LocalDate localDate = LocalDate.of(88, 2,29);
        System.out.println(localDate);
        //System.out.println(LocalDate.now().plusYears(20).minusDays(localDate.getDayOfMonth()));
        //System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
