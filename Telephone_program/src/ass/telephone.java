package ass;

import java.util.ArrayList;

class Contact {
    String name;
    String surname;
    String phoneNumber;
    String emailId;
    String place;

    public Contact(String name, String surname, String phoneNumber, String emailId, String place) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.place = place;
    }

    public void displayContact() {
        System.out.println("Name       : " + name);
        System.out.println("Surname    : " + surname);
        System.out.println("Phone      : " + phoneNumber);
        System.out.println("Email      : " + emailId);
        System.out.println("Place      : " + place);
        System.out.println("----------------------------------");
    }
}

public class telephone {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("kayal", "R", "9876543210", "ka@example.com", "Delhi"));
        contacts.add(new Contact("Priya", "kaviya", "9123456789", "kaviya@example.com", "Mumbai"));
        contacts.add(new Contact("swetha", "s", "9345678901", "swetha@example.com", "Ahmedabad"));

        System.out.println("Telephone Dictionary");
        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }
}
