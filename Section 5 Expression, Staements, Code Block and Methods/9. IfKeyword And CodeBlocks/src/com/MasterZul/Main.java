package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 0;
        int bonus = 100;

        if (gameOver)
            System.out.println("The game is Over: " + gameOver);

        //if the code only have 1 line of code you can ignore code block

        if (score <= 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater then 1000");
        } else {
            System.out.println("Score is less then 1000");
        }

        //code block to indicate the initial and ending of the if keyword execute
        //code block will make the code look more clear


        if (levelCompleted <= 5 && levelCompleted > 1) {
            System.out.println("Your level was less then 5 but greater then 1");
        } else if (levelCompleted < 1) {
            System.out.println("Level is less then 1");
        } else {
            System.out.println("Another");
        }

        //We use else if statement if got more then 2 condition


        //Challenge

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your Final Score: " + finalScore);
        }


    }
}
