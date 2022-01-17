package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
        MultipleContact multipleContact = new MultipleContact();
        while (true) {

            System.out.println("Welcome to Address Book \n 1.Add new Address Book \n 2.Add Contact in Address Book \n " +
                    "3.Edit Contact in Address Book \n 4.Delete Contact in AddressBook \n 5.Print Address Book \n " +
                    "6.Print Contact in Address Book \n 7.Sort Contact in Address Book \n 0.Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    multipleContact.addAddressBook();
                    break;
                case 2:
                    multipleContact.addContactInBook();
                    break;
                case 3:
                    multipleContact.editContactInBook();
                    break;
                case 4:
                    multipleContact.deleteContactInBook();
                    break;
                case 5:
                    multipleContact.printBook();
                    break;
                case 6:
                    multipleContact.printContactInBook();
                    break;
                case 7:
                    multipleContact.sortContacts();
                    break;
                case 0:
                    System.out.println("Exit Application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Entered Wrong input");
            }

        }
    }
}