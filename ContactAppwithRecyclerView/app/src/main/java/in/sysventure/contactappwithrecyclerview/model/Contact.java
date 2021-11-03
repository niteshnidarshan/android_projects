package in.sysventure.contactappwithrecyclerview.model;

import java.io.Serializable;
import java.util.Objects;

public class Contact implements Serializable {

    private int serialNumber;
    private String phoneNumber;
    private String name;

    public Contact(int serialNumber, String phoneNumber, String name) {
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return serialNumber == contact.serialNumber && phoneNumber.equals(contact.phoneNumber) && name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, phoneNumber, name);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "serialNumber=" + serialNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
