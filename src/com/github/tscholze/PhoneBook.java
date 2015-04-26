package com.github.tscholze;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents the attributes of a phone book.
 * <p />
 * User: tobias
 * Date: 10.03.15
 * Time: 19:31
 */
@XmlRootElement(namespace = "http://tscholze.github.io")
public class PhoneBook
{
    private List<Entry> entries = new LinkedList<Entry>();

    @XmlElement(name = "entry")
    public List<Entry> getEntries()
    {
        return entries;
    }

    public void setEntries(List<Entry> entries)
    {
        this.entries = entries;
    }

    public void addEntry(Entry entry)
    {
        entries.add(entry);
    }
}