package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        String myString = "This is String";
        System.out.println("My String: " + myString);
        myString = myString + " this is more";
        System.out.println("2nd String: " + myString);
        myString = myString + "\u00A9 2018";
        System.out.println("3rd String: " + myString);

        String numberString = "250.55";
        numberString = numberString + "40.95";
        System.out.println("Number String: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;  //convert integer into string
        System.out.println("Number: " + lastString);
    }
}
