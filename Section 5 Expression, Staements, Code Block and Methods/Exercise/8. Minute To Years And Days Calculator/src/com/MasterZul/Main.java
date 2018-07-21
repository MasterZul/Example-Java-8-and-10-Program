package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = (long) (minutes / 60);
            long totalDays = (long) (hours / (24));
            long year = (long) (totalDays / 365);
            long days = (long) (totalDays % 365);
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
