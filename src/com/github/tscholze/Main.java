package com.github.tscholze;

/**
 * Starter for the SimplePhoneBook application
 * <p />
 * User: tobias
 * Date: 10.03.15
 * Time: 19:21
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("### SimplePhoneBook Application ###");

        PhoneBookWorker reader = new PhoneBookWorker();
        reader.createPhoneBookByUserInputs();

        System.exit(0);
    }
}

