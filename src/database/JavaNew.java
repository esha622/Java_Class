package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JavaNew {
    static final String URL = "jdbc:mysql://localhost:3307/company";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void insertEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Department: ");
        String department = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the hired date (YYYY-MM-DD): ");
        String hireDate = sc.nextLine();

        String query = "INSERT INTO employees (id, name, department, salary, hire_date) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, department);
        ps.setDouble(4, salary);
        ps.setString(5, hireDate);
        int rowsInserted = ps.executeUpdate();
        System.out.println(rowsInserted + " Employee(s) Inserted");
    }

    public static void updateEmployee(Connection con, Scanner sc) throws SQLException{
        System.out.println("Enter Update ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter New Salary: ") ;
        double salary=sc.nextDouble();
        String query = "UPDATE employees SET salary=? WHERE id=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setDouble(1,salary);
        ps.setInt(2,id);
        int res=ps.executeUpdate();
        System.out.println("Employee Updated");
    }

    // query = DELETE FROM employees WHERE id=? !!!!!
    public static void deleteEmployee(Connection con, Scanner sc) throws SQLException{
        System.out.println("Enter Employee's ID:");
        int id=sc.nextInt();
        sc.nextLine();
// ???????????

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("1. Create Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    insertEmployee(con, sc);
                    break;
                case 2:
                    updateEmployee(con,sc);
                    break;
                case 3:
                    deleteEmployee(con,sc);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
                sc.close();
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}