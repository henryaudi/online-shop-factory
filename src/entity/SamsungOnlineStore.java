package entity;

import factory.OnlineStoreFactory;
import factory.PhoneFactory;

public class SamsungOnlineStore extends OnlineStoreFactory {
    /**
     * Create phone instance associated to the name of the phone given.
     * @param phone: the name of the phone to be created
     * @return: PhoneFactory associated to the given phone model
     */
    @Override
    protected PhoneFactory createPhoneFactory(String phone) {
        return switch (phone) {
            case "Galaxy S" -> new GalaxyS();
            case "Galaxy AI" -> new GalaxyAI();
            default -> null;
        };
    }

    /**
     * Finish the order in Samsung USA Online Store!
     */
    @Override
    public void finish() {
        System.out.println("[CONFIRMED] "
                + this.getUsername()
                + " has successfully placed an order for "
                + this.getPhone()
                + "from Samsung USA Online Store!");
    }
}
