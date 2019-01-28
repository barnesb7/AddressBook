package com.company;

public class AddressBook {

    Entry[] addressBook = new Entry[5];

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

    public void searchByName(String userInputName){
        searchAddressBookHelper(userInputName, "name");
    }

    public void searchByPhoneNumber(String userInputPhoneNumber){
        searchAddressBookHelper(userInputPhoneNumber, "phone");
    }


    private void searchAddressBookHelper(String input, String typeOfSearch){

        for(int i = 0; i < addressBook.length; i++){

            String switchPropertyBySearchType = "";

            if(addressBook[i] != null) {
                if (typeOfSearch.equals("phone")) {
                    switchPropertyBySearchType = addressBook[i].getPhoneNumber();
                } else {
                    switchPropertyBySearchType = addressBook[i].getName();
                }
            }

            if(addressBook[i] != null && switchPropertyBySearchType.equals(input)){
                addressBook[i].print();
                break;
            } else if (i == addressBook.length - 1){
                System.out.println("An entry with " + input + " was not found.");
            }
        }
    }

}
