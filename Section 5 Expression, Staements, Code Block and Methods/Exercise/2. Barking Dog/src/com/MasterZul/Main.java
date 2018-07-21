package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        boolean myDog = bark(true, 7);
        System.out.println("My Dog is bark before 08:00 and after 22:00: " + myDog  );
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking == true) {
            if (hourOfDay < 8 && hourOfDay >= 0) {
                return true;
            } else if (hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
