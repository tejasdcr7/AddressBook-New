package com.blz.addressbook;

public class PersonalInformation {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private long mobileNumber;
    private String emailId;

    public PersonalInformation() {

    }

    public PersonalInformation(String firstname, String lastname, String address, String city, String state, long mobileNumber) {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public PersonalInformation(String firstname, String lastname, String address, String city, String state, long mobileNumber, String emailId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
