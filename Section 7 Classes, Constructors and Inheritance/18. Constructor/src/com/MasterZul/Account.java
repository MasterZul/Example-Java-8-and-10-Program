package com.MasterZul;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmaiLAddress;
    private String customerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default",
                "Default email", "default number"); // must on the first line

        System.out.println("Empty Constructor has been created");
    }

    public Account(String customerName, String customerEmaiLAddress, String customerPhoneNumber) {
        this("999999", 100.55, customerName,customerEmaiLAddress,customerPhoneNumber);
    }

    public Account(String number, double balance, String customerName,
                   String customerEmaiLAddress, String customerPhoneNumber) {

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmaiLAddress = customerEmaiLAddress;
        this.customerPhoneNumber = customerPhoneNumber;

        System.out.println("Constructor with parameter has been created");
    }



    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmaiLAddress() {
        return customerEmaiLAddress;
    }

    public void setCustomerEmaiLAddress(String customerEmaiLAddress) {
        this.customerEmaiLAddress = customerEmaiLAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}
