package factory;

public abstract class OnlineStoreFactory {

    // Data Field
    protected int price;
    protected String mailingAddress;
    protected String username;
    protected PhoneFactory phone;

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public PhoneFactory getPhone() {
        return phone;
    }

    public void setPhone(PhoneFactory phone) {
        this.phone = phone;
    }

    // Methods

    /**
     * Wrapper method to login the system.
     * @param username: the username input
     */
    public void login(String username) {
        setUsername(username);
        System.out.println("[UPDATE] User logged in as \"" + this.getUsername() + "\"");
    }

    /**
     * Wrapper method to update the mailing address
     * @param mailingAddress: mailing address input
     */
    public void inputAddress(String mailingAddress) {
        this.setMailingAddress(mailingAddress);
        System.out.println("[UPDATE] Mailing address was set to \"" + getMailingAddress() + "\"");
    }

    /**
     * Wrapper method to make payment.
     * @param num: the amount being paid
     */
    public void pay(int num) {
        this.setPrice(num);
        System.out.println("[UPDATE] " + this.getUsername() + " paid " + this.getPrice() + " USD for this item.");
    }

    /**
     * Use PhoneFactory to create corresponding phone, and prepare it for the user.
     * @param phone: the name of the phone to be ordered
     */
    public void orderPhone(String phone) {
        PhoneFactory pf;
        pf = createPhoneFactory(phone);
        this.setPhone(pf);
        pf.prepare();
    }

    /**
     * Instantiate a PhoneFactory associate to this online store.
     * @param phone: the name of the phone to be created
     * @return: PhoneFactory that would instantiate phone for the user
     */
    protected abstract PhoneFactory createPhoneFactory(String phone);

    /**
     * Finish!
     */
    public abstract void finish();
}
