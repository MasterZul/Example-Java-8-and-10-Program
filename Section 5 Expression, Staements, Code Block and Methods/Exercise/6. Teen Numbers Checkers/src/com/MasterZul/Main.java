package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int age1 = 13, age2 = 22,age3 =44;

        boolean result = hasTeen(age1,age2,age3);
        System.out.println("The system is to determine if one fo the age input is between 13-19 years old");
        System.out.println("Age1 = " + age1 +" Age2 = " + age2 +" Age3 = " + age3 + " The Result is:  " + result);
    }

    public static boolean hasTeen (int age1, int age2, int age3){
        if ((age1 >= 13 && age1 <=19) || (age2 >=13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)){
            return true;
        }
        else {
            return false;
        }
    }
}
