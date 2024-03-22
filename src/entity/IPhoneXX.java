package entity;

import factory.PhoneFactory;

public class IPhoneXX extends PhoneFactory {

    // Constructor
    public IPhoneXX() {
        this.setCompany("Apple");
        this.setModel("iPhone XX");
    }

    @Override
    public String toString() {
        return "IPhoneXX";
    }
}
