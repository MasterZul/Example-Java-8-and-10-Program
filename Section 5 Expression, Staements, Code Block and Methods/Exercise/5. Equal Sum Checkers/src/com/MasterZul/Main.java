package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int num1 = 1, num2 = 1, num3 = 2;

        boolean result = hasEqualSum(num1, num2, num3);
        System.out.println("The num1 + num2: " + num1 + " + " + num2 + " is equal to = " + num3 + ": " + result);
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else {
            return false;
        }
    }
}
