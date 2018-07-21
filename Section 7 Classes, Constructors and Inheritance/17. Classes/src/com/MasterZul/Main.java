package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car proton = new Car();
        porsche.setModel("911");
        System.out.println( "Model is: " + porsche.getModel());
    }
}
