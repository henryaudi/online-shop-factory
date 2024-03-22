import entity.AppleOnlineStore;
import entity.SamsungOnlineStore;
import factory.OnlineStoreFactory;
import factory.PhoneFactory;

public class Main {
    public static void main(String[] args) {
        // Create online stores.
        OnlineStoreFactory appleStore = new AppleOnlineStore();
        OnlineStoreFactory samsungStore = new SamsungOnlineStore();

        // Log in, input address, make payment, and finish the order.
        System.out.println("------------------------------------------");
        appleStore.login("JohnDoe123");
        appleStore.inputAddress("123 Ave, Dallas, TX, USA");
        appleStore.pay(1599);
        appleStore.orderPhone("iPhone XX Pro Max");
        appleStore.finish();
        System.out.println("------------------------------------------");
        samsungStore.login("JohnDoe123");
        samsungStore.inputAddress("6th Ave, San Francisco, CA, USA");
        samsungStore.pay(1799);
        samsungStore.orderPhone("Galaxy S");
        samsungStore.finish();
        System.out.println("------------------------------------------");
    }
}