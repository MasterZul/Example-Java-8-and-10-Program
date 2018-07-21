package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        System.out.println("***** While Loop Version 1 *****");
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("");
        System.out.println("***** While Loop Version 2 *****");
        int count2 = 1;
        while (true) {
            if (count2 == 6) {

                break;
            }
            System.out.println("Count value is: " + count2);
            count2++;
        }

        System.out.println("");
        System.out.println("***** Do While Loop*****");
        int count3 = 1;
        do {

            System.out.println("Count value is: " + count3);
            count3++;
        } while (count3 != 6);


        // Challenge code
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        System.out.println("");
        System.out.println("***** Challenge Find Even Number*****");

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        public static boolean isEvenNumber ( int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }

}
