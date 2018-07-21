package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int years = 2000;
        boolean leapYear = isLeapYear(years);
        System.out.println("Is " + years + " a leap year?: " + leapYear);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                return true;
            }
        }
        return false;
    }
}
