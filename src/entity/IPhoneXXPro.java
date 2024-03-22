package entity;

import factory.PhoneFactory;

public class IPhoneXXPro extends PhoneFactory {

    // Constructor
    public IPhoneXXPro() {
        this.setCompany("Apple");
        this.setModel("iPhone XX Pro");
    }

    @Override
    public String toString() {
        return "IPhoneXXPro";
    }
}
