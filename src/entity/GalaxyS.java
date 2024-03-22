package entity;

import factory.PhoneFactory;

public class GalaxyS extends PhoneFactory {

    // Constructor
    public GalaxyS() {
        this.setCompany("Samsung");
        this.setModel("Galaxy S");
    }

    @Override
    public String toString() {
        return "GalaxyS";
    }
}
