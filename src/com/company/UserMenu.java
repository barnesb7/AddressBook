package com.company;

public class UserMenu {

    private final String NEWLINE = "\n";
    private String welcomeLine = "Welcome to your addressbook! Choose one of the following options";
    private String seeAllEntries = "[1] See all entries";
    private String addAnEntry = "[2] Add a new entry";
    private String searchByName = "[3] Search entries by name";
    private String searchByPhoneNumber = "[4] Search by phone number";
    private String deleteEntry = "[5] Delete an entry";


    public void showOptions(){
        System.out.println(welcomeLine + NEWLINE + seeAllEntries + NEWLINE + addAnEntry + NEWLINE + searchByName + NEWLINE + searchByPhoneNumber + NEWLINE + deleteEntry);
    }

}
