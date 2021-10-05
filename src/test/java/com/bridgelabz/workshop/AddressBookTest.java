package com.bridgelabz.workshop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {
    private static final String PATH_TXT="./src/main/resources/temp.txt";
    @Test
    public void givenContactsEntries_WhenWrittenToFileShouldMatchAddressEntries() {
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Rajendra", "Gund", "Shirdi", "Ahmednagar", "Maharashtra", 414501l, 9604315270l, "rajendra@gmail.com"));
        contactsList.add(new Contacts("Shushant", "lad", "pune", "Pune", "Maharashtra", 41414l, 888876453l, "shushant@gmail.com"));
        AddressBook addressBook=new AddressBook(contactsList);
        addressBook.writeFileData(PATH_TXT);
    }
    @Test
    public void givenContactsEntries_WhenReadingTotalFileShouldMatch(){
        AddressBook service=new AddressBook();
        long entries=service.readFile(PATH_TXT);
        Assert.assertEquals(2,entries);
    }

}