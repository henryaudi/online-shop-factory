package entity;

import factory.OnlineStoreFactory;
import factory.PhoneFactory;

public class SamsungOnlineStore extends OnlineStoreFactory {
    @Override
    protected PhoneFactory createPhoneFactory(String phone) {
        return switch (phone) {
            case "Galaxy S" -> new GalaxyS();
            case "Galaxy AI" -> new GalaxyAI();
            default -> null;
        };
    }

    @Override
    public void finish() {
        System.out.println("[CONFIRMED] "
                + this.getUsername()
                + " has successfully placed an order for "
                + this.getPhone()
                + "from Samsung USA Online Store!");
    }
}
