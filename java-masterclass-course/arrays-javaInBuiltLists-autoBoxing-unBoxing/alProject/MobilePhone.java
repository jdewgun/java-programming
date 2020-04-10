package alProject;

import java.util.ArrayList;

import alProject.Contact;

/**
 * MobilePhone
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumberVal) {
        this.myNumber = phoneNumberVal;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contactToAdd) {
        if (findContact(contactToAdd) >= 0) {
            System.out.println("Contact Exists On DataBase");
        }

        myContacts.add(contactToAdd);
        return true;
    }

    private int findContact(Contact contactToFind) {
        return this.myContacts.indexOf(contactToFind);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " does not exist on DataBase");
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " has been replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contactToRemove) {
        int foundPosition = findContact(contactToRemove);

        if (foundPosition < 0) {
            System.out.println(contactToRemove.getName() + " does not exist on DataBase");
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contactToRemove.getName() + " has been successfully removed");
        return true;
    }

    public String queryContact(Contact contactToQuery) {
        if (findContact(contactToQuery) >= 0) {
            return contactToQuery.getName();
        }
        return null;
    }

    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        if (position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contacts List: ");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -- "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }
}