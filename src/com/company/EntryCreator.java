package com.company;

import java.util.Scanner;

public class EntryCreator {

    Scanner scanner = new Scanner(System.in);

    public Entry create(){

        System.out.println("What is the name for this entry?");
        String entryName = scanner.nextLine();
        System.out.println("What is the address for " + entryName + " ?");
        String address = scanner.nextLine();

        System.out.println("What is the phone number for " + entryName + " ?");
        String phoneNumber = scanner.nextLine();

        System.out.println("What is the birth month for " + entryName + " ?");
        String birthMonth =  scanner.nextLine();

        System.out.println("What is the birth day of month for" + entryName + " ?");
        String dayOfMonth = scanner.nextLine();

        System.out.println("What is the birth year for " + entryName + " ?");
        String birthYear = scanner.nextLine();

        String entireBirthdayString = birthMonth + "-" + dayOfMonth + "-" + birthYear;

        Entry entry = new Entry(entryName, address, phoneNumber, entireBirthdayString);

        return entry;

    }


}
