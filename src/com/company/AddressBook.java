package com.company;

public class AddressBook {

    Entry[] addressBook = new Entry[10];

    public void addEntry(Entry entry){

        for(int i = 0; i < addressBook.length; i++){
            if(addressBook[i] == null){
                addressBook[i] = entry;

                if(i == addressBook.length - 1){
                    System.out.println("Your address book is now full. You must delete an entry before adding another ");
                }
                break;
            }
        }
    }


    public void printAllEntries(){
        for (int i = 0; i < addressBook.length; i++){

           if(addressBook[i] != null){
               addressBook[i].print();
           }
        }
    }


}