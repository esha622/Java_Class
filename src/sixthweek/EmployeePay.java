package sixthweek;

//A company wants to calculate the daily pay of employees based on their job role.
// Each job role has a fixed daily pay rate.
//if the job role is invalid, the program should notify the user.

import java.util.Scanner;
import java.util.TreeMap;

public class EmployeePay {
    public static void main(String[] args) {
        TreeMap<String, Integer> amt = new TreeMap<>();
        amt.put("Manager", 200);
        amt.put("Engineer", 150);
        amt.put("Technician", 100);
        amt.put("Clerk", 80);

        // Display available job roles
        System.out.println("Available job roles: " + amt.keySet());

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the job role: ");
        String jobRole = scanner.nextLine().trim(); // Read user input and trim whitespace

        // Check if the job role exists in the map (case insensitive)
        if (amt.containsKey(jobRole)) {
            // Get the daily pay for the job role
            int dailyPay = amt.get(jobRole);
            System.out.println("The daily pay for " + jobRole + " is: $" + dailyPay);
        } else {
            // Notify the user if the job role is invalid
            System.out.println("Invalid job role. Please enter a valid job role from the list.");
        }
        scanner.close();
    }
}
