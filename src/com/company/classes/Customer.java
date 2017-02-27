package com.company.classes;

/**
 * Created by nxtlvl on 2/17/2017.
 */
public class Customer extends Person {
    private String address;
    private long telephoneNumber;
    private String customerID;

    public Customer(){}
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String introduceYourself(String firstName, String lastName) {
        return "Hello I'm Customer: "+ firstName + " "+ lastName;
    }
    public String introduceYourself(String address, long telephoneNumber) {
        return "MY ADDRESS IS: "+ address + ". "+ "MY NUMBER IS: "+ telephoneNumber + "." ;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
