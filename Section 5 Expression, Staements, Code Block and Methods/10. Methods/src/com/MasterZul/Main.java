package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        int score = 100;
        int levelComplete = 5;
        boolean gameOver = false;

        score = calculateScore(gameOver, levelComplete, score); //call the method at the main

        System.out.println("Final Score: " + score);

        //Challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Zul", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lam", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("San", highScorePosition);

        highScorePosition = calculateHighScorePosition(90);
        displayHighScorePosition("Lip", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int levelComplete, int score) { //define the method here

        gameOver = true;

        if (gameOver) {
            System.out.println("Score: " + score);
            int bonusScore = 500;
            score = score + bonusScore;
            System.out.println("Level Complete: " + levelComplete);
        }
        return score; // you can return the result here
    }

    //Challenge

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into the position: " +
                highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
