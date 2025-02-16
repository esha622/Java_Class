package FourthWeek;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");

        LocalDate todayDate = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Today's date: " + todayDate.format(dateFormatter));
        System.out.println("Current time: " + time);
        System.out.println("Current date and time: " + dateTime);
    }
}