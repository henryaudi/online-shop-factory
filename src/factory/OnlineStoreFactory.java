package factory;

public abstract class OnlineStoreFactory {

    // Data Field
    protected int price;
    protected String mailingAddress;
    protected String username;
    protected PhoneFactory phone;

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
    public void login(String username) {
        setUsername(username);
        System.out.println("[UPDATE] User logged in as \"" + this.getUsername() + "\"");
    }

    public void inputAddress(String mailingAddress) {
        this.setMailingAddress(mailingAddress);
        System.out.println("[UPDATE] Mailing address was set to \"" + getMailingAddress() + "\"");
    }

    public void pay(int num) {
        this.setPrice(num);
        System.out.println("[UPDATE] " + this.getUsername() + " paid " + this.getPrice() + " USD for this item.");
    }

    public void orderPhone(String phone) {
        PhoneFactory pf;
        pf = createPhoneFactory(phone);
        this.setPhone(pf);
        pf.prepare();
    }

    protected abstract PhoneFactory createPhoneFactory(String phone);
    public abstract void finish();
}
