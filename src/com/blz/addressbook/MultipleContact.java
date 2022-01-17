package com.blz.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class MultipleContact {
    Scanner scanner = new Scanner(System.in);
    PersonalInformation person = new PersonalInformation();

    List<PersonalInformation> contactList = new ArrayList<>();
    HashMap<String, Contact> contactService = new HashMap<>();

    public void addAddressBook() {
        System.out.println("Enter Name of new Address Book: ");
        String bookName = scanner.next();
        if (contactService.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
            addAddressBook();
        } else {
            Contact contact = new Contact();
            contactService.put(bookName, contact);
            System.out.println("press 1 if you want to add another book or press 0 to exit.");
            int newBook = scanner.nextInt();
            if (newBook == 1) {
                addAddressBook();
            }
        }
    }

    public void addContactInBook() {
        System.out.println("Enter the name of Address book to add contact");
        String newContact = scanner.next();
        Contact addressBook = contactService.get(newContact);
        if (addressBook != null) {
            contactService.get(newContact).addContact();
        } else{
            System.out.println("No book found");
        }
    }
    public void editContactInBook(){
        System.out.println("Enter name to edit");
        String editName = scanner.next();
        if (contactService.containsKey(editName)){
            contactService.get(editName).editContact();
        }else{
            System.out.println("Book doesn't Exists");
        }
    }
    public void deleteContactInBook(){
        System.out.println("Enter name to delete from Address Book");
        String book = scanner.next();
        if (contactService.containsKey(book)) {
            contactService.get(book).deleteContact();
        }else{
            System.out.println("Name doesn't Exists");
        }
    }
    public void printContactInBook(){
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            System.out.println(entry.getValue().contactList);
        }
        System.out.println(" ");
    }

    public void printBook(){
        System.out.println("Address Book Programs are: ");
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
    public void sortContacts() {
        while (true) {
            System.out.println("Enter\n 1. By name\n 2. By city\n 3. By state\n 4. By zip code\n0. for previous menu");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    sortByName();
                    break;
                case 2:
                    sortByCity();
                    break;
                case 3:
                    sortByState();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Entered choice is incorrect!.. please enter correct choice");
            }
        }
    }

    //sort the contacts by name
    public void sortByName(){
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            List<PersonalInformation> contactListByState = entry.getValue().contactList;
            List<PersonalInformation> list = contactListByState.stream().collect(Collectors.toList());
            list.stream().sorted((g1, g2) -> ((String)g1.getFirstname()).compareTo(g2.getFirstname())).forEach(contact -> System.out.println(contact));
        }
    }

    //sort the contacts by city
    public void sortByCity(){
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            List<PersonalInformation> contactListByState = entry.getValue().contactList;
            List<PersonalInformation> list = contactListByState.stream().collect(Collectors.toList());
            list.stream().sorted((g1, g2) -> ((String)g1.getCity()).compareTo(g2.getCity())).forEach(contact -> System.out.println(contact));
        }
    }

    //sort the contacts by state
    public void sortByState(){
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            List<PersonalInformation> contactListByState = entry.getValue().contactList;
            List<PersonalInformation> list = contactListByState.stream().collect(Collectors.toList());
            list.stream().sorted((g1, g2) -> ((String)g1.getState()).compareTo(g2.getState())).forEach(contact -> System.out.println(contact));
        }
    }

}
