package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        System.out.println("This one using increment style");
        for (int i = 2; i < 6; i++) {//init: condition: iterator //increasing

            System.out.println("10,000 at " + i + "%" + " + interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("");
        System.out.println("This one using decrement style");
        for (int i = 5; i > 1; i--) {//init: condition: iterator // decreasing

            System.out.println("10,000 at " + i + "%" + " + interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
