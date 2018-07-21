package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 3;

        boolean result = areEqualByThreeDecimalPlaces(num1,num2);
        System.out.println("Both numbers num1 = "  + num1 + " and num2 = " + num2 +" is equal: " + result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        one *= 1000;
        two *= 1000;
        if((int)one == (int)two){return true;}
        else return false;
    }
}
