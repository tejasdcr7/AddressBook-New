package com.blz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
    Scanner scanner = new Scanner(System.in);
    PersonalInformation person = new PersonalInformation();
    List<PersonalInformation> contactList = new ArrayList<>();

    public void addContact() {
        System.out.println("Enter the number of contact you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++)
        {
            System.out.println("Enter contact Details of Person");
            createContact();
        }
    }

        public void createContact () {
            System.out.println("Enter First name");
            String firstname = scanner.next();
            System.out.println("Enter Last name");
            String lastname = scanner.next();
            System.out.println("Enter Address");
            String address = scanner.next();
            System.out.println("Enter city");
            String city = scanner.next();
            System.out.println("Enter state");
            String state = scanner.next();
            System.out.println("Enter Mobile number");
            long mobileNumber = scanner.nextLong();
            person = new PersonalInformation(firstname, lastname, address, city, state, mobileNumber);
            contactList.add(person);
            System.out.println(contactList);
        }


    public void deleteContact() {
        System.out.println("Enter the first name to delete contact");
        String deletename = scanner.next();

        for (int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getFirstname();
            if (name.equalsIgnoreCase(deletename)) {
                contactList.remove(i);
                System.out.println("Contact Deleted");
            }
            else{
                System.out.println("Contact not found");
            }
        }
    }

    public void editContact(){
        System.out.println("Enter the First name to edit contact");
        String editname = scanner.next();
        boolean edited =false;

        for (int i=0; i < contactList.size(); i++ ){
            String name = contactList.get(i).getFirstname();
            if (name.equalsIgnoreCase(editname)){
                contactList.remove(person);
                createContact();
                edited=true;
                break;
            }
        }
        if (!edited);
        System.out.println("Incorrect name");
    }
}
