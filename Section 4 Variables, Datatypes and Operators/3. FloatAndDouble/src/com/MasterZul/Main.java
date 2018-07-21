package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        //Width of 32 (4 byte)
        float myFloatValue = 5f/ 2f;

        //Width of 54 (8 byte) more precise,fast and widely use;
        double myDoubleValue = 5d/ 2d;

        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        //Convert pound to kilogram
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms: " + convertedKilograms); // 90.7185

        double pi = 3.1415927d;
    }
}
