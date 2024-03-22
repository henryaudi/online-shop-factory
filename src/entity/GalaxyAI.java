package entity;

import factory.PhoneFactory;

public class GalaxyAI extends PhoneFactory {

    // Constructor
    public GalaxyAI() {
        this.setCompany("Samsung");
        this.setModel("Galaxy AI");
    }

    // Methods
    @Override
    public String toString() {
        return "GalaxyAI";
    }
}
