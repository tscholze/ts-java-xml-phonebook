package com.github.tscholze;

import javax.xml.bind.JAXB;
import java.io.File;
import java.util.Scanner;

/**
 * Creates a new {@link com.github.tscholze.PhoneBook} object
 * by reading user's input.
 * <p />
 * User: tobias
 * Date: 10.03.15
 * Time: 19:42
 */
public class PhoneBookWorker
{
    private Scanner scanner = new Scanner(System.in);

    /**
     * Adds new entries to the {@link com.github.tscholze.PhoneBook} as long as
     * the user does not complete the action.
     */
    public void createPhoneBookByUserInputs()
    {
        PhoneBook phoneBook = new PhoneBook();
        boolean userHasFinished = false;

        while (!userHasFinished)
        {
            phoneBook.addEntry(readNewEntry());
            userHasFinished = checkUserFinished();
        }

        File file = new File("phonebook.xml");
        JAXB.marshal(phoneBook, file);

        System.out.println(String.format("Xml file has been created. Path: %s", file.getAbsolutePath()));
    }

    private Entry readNewEntry()
    {
        Entry newEntry = new Entry();

        System.out.println();

        System.out.print("Enter name: ");
        newEntry.setName(scanner.nextLine());

        System.out.print("Enter last name: ");
        newEntry.setLastName(scanner.nextLine());

        System.out.print("Enter phone number: ");
        newEntry.setPhoneNumber(scanner.nextLine());

        System.out.println();

        return newEntry;
    }

    private boolean checkUserFinished()
    {
        System.out.print("Finished (y/n): ");
        return scanner.nextLine().equals("y");
    }
}