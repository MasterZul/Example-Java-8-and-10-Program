package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //addition
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1; //subtraction
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10; // multiplication
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5; // division
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;//remainder
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result++; //increment
        System.out.println("result++ = " + result);

        result--; //decrement
        System.out.println("result-- = " + result);

        result += 2;// short for addition
        System.out.println("result+=2: " + result);

        result -= 2;// short for subtraction
        System.out.println("result-=2: " + result);

        result *= 2;// short for multiplication
        System.out.println("result*=2: " + result);

        result /= 2;// short for division
        System.out.println("result/=2: " + result);

        boolean isAlien = true;
        if (isAlien == true) // if condition
            System.out.println("It is alien");

        if (isAlien) // if condition
            System.out.println("It is alien");

        int topScore = 100;

        if (topScore == 100) // equal then
            System.out.println("You got the high score");

        topScore = 101;

        if (topScore >= 100) // greater equal then
            System.out.println("You got the high score greater then 100");

        topScore = 80;

        if (topScore <= 100) // less equal then
            System.out.println("You got the high score less then 100");

        int secondScore = 60; // AND condition
        if ((topScore > secondScore) && (secondScore < 100))
            System.out.println("Both of the condition is true");

        secondScore = 40; // OR condition
        if ((topScore > secondScore) || (secondScore < 100))
            System.out.println("One of the condition is true");

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is " + wasCar );

        //Challenge

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal );

        double theRemainder = myTotal % 40;
        System.out.println("Remainder = " + theRemainder );
        if(theRemainder <= 20)
            System.out.println("Total was not over the limit");
    }
}
