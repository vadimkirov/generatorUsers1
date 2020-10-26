package model;

public class Product {

    String pole1;

    String originalUid;

    String uid;

    String title;

    String name;

    String description;

    String sessionLanguage;

    String sessionCurrency;

    String groups;

    String password;

    String customerID;


    public Product(String pole1, String originalUid, String uid,
                   String title, String name, String description,
                   String sessionLanguage, String sessionCurrency,
                   String groups, String password, String customerID) {
        this.pole1 = pole1;
        this.originalUid = originalUid;
        this.uid = uid;
        this.title = title;
        this.name = name;
        this.description = description;
        this.sessionLanguage = sessionLanguage;
        this.sessionCurrency = sessionCurrency;
        this.groups = groups;
        this.password = password;
        this.customerID = customerID;
    }

    public String getPole1() {
        return pole1;
    }

    public String getOriginalUid() {
        return originalUid;
    }

    public String getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSessionLanguage() {
        return sessionLanguage;
    }

    public String getSessionCurrency() {
        return sessionCurrency;
    }

    public String getGroups() {
        return groups;
    }

    public String getPassword() {
        return password;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setPole1(String pole1) {
        this.pole1 = pole1;
    }

    public void setOriginalUid(String originalUid) {
        this.originalUid = originalUid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSessionLanguage(String sessionLanguage) {
        this.sessionLanguage = sessionLanguage;
    }

    public void setSessionCurrency(String sessionCurrency) {
        this.sessionCurrency = sessionCurrency;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pole1='" + pole1 + '\'' +
                ", originalUid=" + originalUid +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sessionLanguage='" + sessionLanguage + '\'' +
                ", sessionCurrency='" + sessionCurrency + '\'' +
                ", groups='" + groups + '\'' +
                ", password='" + password + '\'' +
                ", customerID=" + customerID +
                '}';
    }
}
