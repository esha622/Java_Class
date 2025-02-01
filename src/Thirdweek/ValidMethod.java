package Thirdweek;

import java.util.Scanner;

public class ValidMethod {
    static String validateUser (String username, String password) {
        String validUsername = "isha@yahoo.com";
        String validPassword = "1234";

        if (username == validUsername && password == validPassword) {
            return "Success";
        } else {
            return "Not valid username or password";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.next();
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scc.next();

        String availabilityMessage = validateUser (username, password);
        System.out.println(availabilityMessage);
    }
}