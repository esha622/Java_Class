package Thirdweek;

import java.util.Scanner;

public class ReservationMethod {
    // Method to check availability of a specific date
    static String checkAvailability(String[] bookedDates, String dateToCheck) {
        for (String bookedDate : bookedDates) {
            if (bookedDate.equals(dateToCheck)) {
                return "Room is not available on " + dateToCheck;
            }
        }
        return "Room is available on " + dateToCheck;
    }

    public static void main(String[] args) {
        // Array of booked dates
        String[] bookedDates = {"2025-01-21", "2025-01-22", "2025-01-23", "2025-01-24", "2025-01-29"};

        // Get date to check from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String dateToCheck = sc.next();
        //String dateToCheck = "2025-01-22"; // Change this date to test different scenarios

        // Check availability
        String availabilityMessage = checkAvailability(bookedDates, dateToCheck);
        System.out.println(availabilityMessage);

        sc.close(); // Close the scanner to avoid resource leaks
    }
}