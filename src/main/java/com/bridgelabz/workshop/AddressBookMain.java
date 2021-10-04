package com.bridgelabz.workshop;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Contacts contact = new Contacts("Rajendra", "Gund", "Shirdi", "Ahmednagar", "Maharashtra", 414501, "9604315270", "rajendragund@gmail.com");
        System.out.println(contact);
    }

}
