package com.MasterZul;

public class Main {

    public static void main(String[] args) {

       //Integer has a width of 32
       int myMinValue = -2_147_483_648;
       int myMaxValue = 2_147_483_647;

       int myTotal = (myMinValue/2);
       System.out.println("myTotal: " + myTotal);

       //Integer has a width of 8
       byte myMinByteValue = -128;
       byte myMaxByteValue = 127;

       byte myByteTotal =  (byte)(myMaxByteValue/2);
       System.out.println("MyByteTotal: " + myByteTotal);

       //Integer has a width of 16
       short myMinShortValue = -32768;
       short myMaxShortValue = 32767;

       short myShortTotal = (short)(myMaxShortValue/2);
       System.out.println("myShortTotal: " + myShortTotal);

       //Long has a width of 64
       long myMinLongValue = -9_223_372_036_854_775_808L;
       long myMaxLongValue = 9_223_372_036_854_775_807L;

       long myLongTotal = (myMaxLongValue/2);
       System.out.println("myLongTotal: " + myLongTotal);
    }
}
