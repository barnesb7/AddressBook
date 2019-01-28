package com.company;

public class UserMenu {

    private final String NEWLINE = "\n";
    private String welcomeLine = "Welcome to your address book! Choose one of the following options";
    private String seeAllEntriesOption = "[1] See all entries";
    private String addAnEntryOption = "[2] Add a new entry";
    private String searchByNameOption = "[3] Search entries by name";
    private String searchByPhoneNumberOption = "[4] Search by phone number";
    private String deleteEntryOption = "[5] Delete an entry";
    private String exitOption = "[6] Exit";


    public void showOptions(){
        System.out.println(welcomeLine + NEWLINE + seeAllEntriesOption + NEWLINE + addAnEntryOption + NEWLINE
                + searchByNameOption + NEWLINE + searchByPhoneNumberOption + NEWLINE + deleteEntryOption + NEWLINE
                + exitOption);
    }
}
