package com.github.tscholze;

/**
 * Represents the attributes of a {@link com.github.tscholze.PhoneBook}'s entry.
 * <p />
 * User: tobias
 * Date: 10.03.15
 * Time: 19:33
 */
public class Entry
{
    private String name;
    private String lastName;
    private String phoneNumber;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %s: %s", lastName, name, phoneNumber);
    }
}