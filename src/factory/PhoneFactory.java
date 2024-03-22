package factory;

public abstract class PhoneFactory {

    // Data Field
    private String company;
    private String model;


    // Getters and Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Methods

    /**
     * Prepare for the order...
     */
    protected void prepare() {
        System.out.println("[WAITING] Preparing " + this.getModel() + " manufactured by " + this.getCompany() + "...");
    }
}
