package com.MasterZul;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Main {

    public static void main(String[] args) {

//        Account zulAccount = new Account();
//
//        zulAccount.withdrawal(100.0);
//        zulAccount.deposit(50.0);
//        zulAccount.withdrawal(100.0);
//        zulAccount.deposit(51.0);
//        zulAccount.withdrawal(100.0);
//
//        Account timeAccount = new Account("Tim",
//                "tim@gmail.com", "12345");
//        System.out.println("Account Number: " + timeAccount.getNumber() + " Name: " + timeAccount.getCustomerName());

            VipPerson person1 = new VipPerson();
            System.out.println(person1.getName());

            VipPerson person2 = new VipPerson("Bob", 2500.0);
            System.out.println(person2.getName() + " " + person2.getCreditLimit());

            VipPerson person3 = new VipPerson("Zul", 500.0, "masterzul95@gmail.com");
            System.out.println(person3.getName() + " " + person3.getCreditLimit() + " " + person3.getEmailAddress());


    }
}
