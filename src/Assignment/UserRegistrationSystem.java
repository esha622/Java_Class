package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class RegistrationException extends Exception {
    public RegistrationException(String message) {
        super(message);
    }
}
class UserRegistration {
    private List<User> users = new ArrayList<>();
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public void registerUser (String name, String email, String password) throws RegistrationException {
        if (name == null || name.isEmpty()) {
            throw new RegistrationException("Name cannot be empty.");
        }
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new RegistrationException("Invalid email format.");
        }
        if (password.length() < 6) {
            throw new RegistrationException("Password must be at least 6 characters long.");
        }

        users.add(new User(name, email, password));
        System.out.println("User  registered successfully: " + name);
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        users.forEach(System.out::println);
    }
}

public class UserRegistrationSystem {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        Thread registrationThread = new Thread(() -> {
            while (true) {
                System.out.print("Enter name (or 'exit' to quit): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                try {
                    userRegistration.registerUser (name, email, password);
                } catch (RegistrationException e) {
                    System.out.println("Registration failed: " + e.getMessage());
                }
            }
        });

        registrationThread.start();

        try {
            registrationThread.join();
        } catch (InterruptedException e) {
            System.out.println("Registration thread interrupted.");
        }

        userRegistration.displayUsers();
        scanner.close();
    }
}