package FifthWeek;

//A university needs to manage student's grades dynamically. They want to store, update and display student's grades

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeHash {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Student Grades Manager!");

        while (true) {
            System.out.print("\nCommand (add/update/display/exit): ");
            command = sc.nextLine().toLowerCase();

            if (command.equals("exit"))
                break;

            switch (command) {
                case "add":
                case "update":
                    System.out.print("Enter student Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    sc.nextLine();
                    grades.put(studentName, grade);
                    System.out.println("Grade for student " + studentName + " set to " + grade);
                    break;

                case "display":
                    System.out.println("Student Grades:");
                    if (grades.isEmpty()) {
                        System.out.println("No grades available.");
                    } else {
                        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        sc.close();
        System.out.println("Exiting the program.");
    }
}
