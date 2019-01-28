package com.company;

import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    UserMenu userMenu = new UserMenu();
    AddressBook addressBook = new AddressBook();
    EntryCreator entryCreator = new EntryCreator();

    boolean shouldContinue = true;

         do {
             userMenu.showOptions();
             String userInput = scanner.nextLine();

             if (userInput.equals("1")) {
                 addressBook.printAllEntries();
             } else if (userInput.equals("2")) {
                 //add new entry
                 Entry newEntry = entryCreator.create();
                 addressBook.addEntry(newEntry);
             } else if (userInput.equals("3")) {
                //search by name
                 System.out.println("Please enter the name");
                 userInput = scanner.nextLine();
                 addressBook.searchByName(userInput);
             } else if (userInput.equals("4")) {
                 // search by phoneNumber
                 System.out.println("Please enter the phone number");
                 userInput = scanner.nextLine();
                 addressBook.searchByPhoneNumber(userInput);

             } else if (userInput.equals("5")) {
                 // delete an entry
                 System.out.println("What is the name of the entry you would like to delete?");
                 userInput = scanner.nextLine();
                 addressBook.deleteEntry(userInput);
             } else if (userInput.equals("6")) {
                 //exit
                 shouldContinue = false;
                 System.out.println("Thank you! Goodbye");
             } else {
                 System.out.println("Please choose an option from below");
             }
         }while(shouldContinue);
    }
}
