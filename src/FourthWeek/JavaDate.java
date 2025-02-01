package FourthWeek;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        // Create a DateTimeFormatter if needed (not used in this example)
        //DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");

        // Get the current date and time
        LocalDate todayDate = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // Print the current date and time
        System.out.println("Today's date: " + todayDate.format(dateFormatter));
        System.out.println("Current time: " + time);
        System.out.println("Current date and time: " + dateTime);
    }
}