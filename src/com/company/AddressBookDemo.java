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
             } else if (userInput.equals("4")) {
                 // search by phoneNumber
             } else if (userInput.equals("5")) {
                 // delete an entry
             } else {
                 //please choose a number
             }
         }while(shouldContinue);
    }
}
