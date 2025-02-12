package FifthWeek;

//A company needs an employee directory where each employee has a unique ID and name.
// They want to look up an employee's name based on their ID

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHash {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        Scanner scc = new Scanner(System.in);
        String employeeinfo;

        while(true) {
            System.out.println("\nEnter the information of the employee: ");
            employeeinfo = scc.nextLine().toLowerCase();

            if (employeeinfo.equals("exist"))
                break;

            switch (employeeinfo){
                case "add":
                case "update":
                    System.out.print("Enter employee ID: ");
                    int employeeID = scc.nextInt();
                    System.out.print("Enter employee Name: ");
                    String employeename = scc.nextLine();
                    scc.nextLine();
                    employees.put(employeeID, employeename);
                    System.out.println("Employee ID:" + employeeID + " and Employee Name:" + employeename);
                    break;

                case "display":
                    System.out.println("Employee ID:");
                    if (employees.isEmpty()) {
                        System.out.println("No ID available.");
                    } else {
                        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                            System.out.println("Employee ID: " + entry.getKey() + ", Employee Name: " + entry.getValue());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        scc.close();
        System.out.println("Exiting the program.");
    }
}
