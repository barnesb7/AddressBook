package com.company;

public class Entry {

    private final String COMMA_SPACE = ", ";

    String name;
    String address;
    String phoneNumber;
    String birthday;


    public Entry(String name, String address, String phoneNumber, String birthday){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public void print(){
        System.out.println( "<---" + name + COMMA_SPACE + address + COMMA_SPACE + phoneNumber + COMMA_SPACE + birthday + "--->");
    }
}
