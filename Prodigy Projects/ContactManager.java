import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    // Class to represent a contact
    static class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
        }
    }

    // Class to manage contacts
    static class ContactManagerApp {
        private ArrayList<Contact> contacts;
        private Scanner scanner;

        public ContactManagerApp() {
            contacts = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void addContact() {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact(name, phoneNumber, email);
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        }

        public void viewContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts available.");
            } else {
                System.out.println("Contact List:");
                for (int i = 0; i < contacts.size(); i++) {
                    System.out.println((i + 1) + ". " + contacts.get(i));
                }
            }
        }

        public void editContact() {
            System.out.print("Enter the number of the contact to edit: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < contacts.size()) {
                Contact contact = contacts.get(index);
                System.out.println("Editing contact: " + contact);

                System.out.print("Enter new name (leave blank to keep current): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    contact.setName(newName);
                }

                System.out.print("Enter new phone number (leave blank to keep current): ");
                String newPhoneNumber = scanner.nextLine();
                if (!newPhoneNumber.isEmpty()) {
                    contact.setPhoneNumber(newPhoneNumber);
                }

                System.out.print("Enter new email (leave blank to keep current): ");
                String newEmail = scanner.nextLine();
                if (!newEmail.isEmpty()) {
                    contact.setEmail(newEmail);
                }

                System.out.println("Contact updated successfully.");
            } else {
                System.out.println("Invalid contact number.");
            }
        }

        public void deleteContact() {
            System.out.print("Enter the number of the contact to delete: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < contacts.size()) {
                contacts.remove(index);
                System.out.println("Contact deleted successfully.");
            } else {
                System.out.println("Invalid contact number.");
            }
        }

        public void showMenu() {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. View contact list");
            System.out.println("3. Edit a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Exit");
        }

        public void start() {
            int choice;

            do {
                showMenu();
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        viewContacts();
                        break;
                    case 3:
                        editContact();
                        break;
                    case 4:
                        deleteContact();
                        break;
                    case 5:
                        System.out.println("Exiting Contact Manager. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        ContactManagerApp app = new ContactManagerApp();
        app.start();
    }
}
