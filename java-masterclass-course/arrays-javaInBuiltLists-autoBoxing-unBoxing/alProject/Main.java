package alProject;

import java.util.Scanner;
import alProject.MobilePhone;

/**
 * Main
 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8866 3344 8877");

    public static void main(String[] args) {
        boolean shutDown = false;

        startPhone();
        printActions();

        while (!shutDown) {
            System.out.println("Choose Option (6 - To Print Available Options)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
            case 0:
                System.out.println("Switching Off Device");
                shutDown = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Switched Phone ON");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \n Press");
        System.out.println("0 - To Switch Off Phone \n" + "1 - To Print Contacts \n" + "2 - To Add a new contact \n"
                + "3 - To Update a contact \n" + "4 - To Remove a contact \n" + "5 - Query and Existing Contact \n"
                + "6 - To Print This List Again \n");
        System.out.println("Please Select Your Action: ");
    }

    private static void addNewContact() {
        System.out.println("Enter New Contact Name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(contactName, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("Contact Successfully Added");
        } else {
            System.out.println("Cannot Add Contact");
        }
    }

    private static void updateContact() {
        System.out.println("Enter Contact Name To Update: ");
        String contactName = scanner.nextLine();
        Contact contactToUpdate = mobilePhone.queryContact(contactName);
        if (contactToUpdate == null) {
            System.out.println("Given Contact Does Not Exist.");
            return;
        }

        System.out.println("Enter Contact Name: ");
        String contactNameNew = scanner.nextLine();
        System.out.println("Enter Contact Phone Number: ");
        String contactNumberNew = scanner.nextLine();

        Contact contactNew = Contact.createContact(contactNameNew, contactNumberNew);
        if (mobilePhone.updateContact(contactToUpdate, contactNew)) {
            System.out.println("Successfully Updated Records");
        } else {
            System.out.println("Error Updating Records");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String contactName = scanner.nextLine();
        Contact contactToDelete = mobilePhone.queryContact(contactName);
        if (contactToDelete == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(contactToDelete)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact contactToQuery = mobilePhone.queryContact(name);
        if (contactToQuery == null) {
            System.out.println("Contact Not Found.");
            return;
        }

        System.out.println("Name: " + contactToQuery.getName() + " phone number is " + contactToQuery.getPhoneNumber());
    }

}