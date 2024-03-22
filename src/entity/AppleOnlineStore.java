package entity;

import factory.OnlineStoreFactory;
import factory.PhoneFactory;

public class AppleOnlineStore extends OnlineStoreFactory {

    @Override
    protected PhoneFactory createPhoneFactory(String phone) {
        return switch (phone) {
            case "iPhone XX Pro Max" -> new IPhoneXXProMax();
            case "iPhone XX Pro" -> new IPhoneXXPro();
            case "iPhone XX" -> new IPhoneXX();
            default -> null;
        };
    }

    @Override
    public void finish() {
        System.out.println("[CONFIRMED] "
                + this.getUsername()
                + " has successfully placed an order for "
                + this.getPhone()
                + " from Apple Online Store!");
    }
}
