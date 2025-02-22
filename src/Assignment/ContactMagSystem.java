package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class ContactMagSystem {
    private List<Contact> contacts;
    private Map<String, Contact> contactMap;

    public ContactMagSystem() {
        contacts = new ArrayList<>();
        contactMap = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        contactMap.put(name.toLowerCase(), contact);
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact getContactByName(String name) {
        return contactMap.get(name.toLowerCase()); // Case-insensitive search
    }

    public static void main(String[] args) {
        ContactMagSystem contactManager = new ContactMagSystem();
        Scanner scanner = new Scanner(System.in);

        contactManager.addContact("Alice Johnson", "123-456-7890", "alice@example.com");
        contactManager.addContact("Bob Smith", "987-654-3210", "bob@example.com");
        contactManager.addContact("Charlie Brown", "555-555-5555", "charlie@example.com");

        contactManager.displayContacts();

        System.out.print("Enter a contact name to find their details: ");
        String name = scanner.nextLine();
        Contact contact = contactManager.getContactByName(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}