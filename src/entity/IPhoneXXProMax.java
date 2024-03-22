package entity;

import factory.PhoneFactory;

public class IPhoneXXProMax extends PhoneFactory {

    // Constructor
    public IPhoneXXProMax() {
        this.setCompany("Apple");
        this.setModel("iPhone XX Pro Max");
    }

    @Override
    public String toString() {
        return "IPhoneXXProMax";
    }
}
