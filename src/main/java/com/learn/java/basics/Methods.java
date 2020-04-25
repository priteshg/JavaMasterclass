package com.learn.java.basics;

public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);


        displayHighScorePosition("jack", calculateHighScorePosition(1500));
        displayHighScorePosition("Andrew", calculateHighScorePosition(900));
        displayHighScorePosition("Sally", calculateHighScorePosition(400));
        displayHighScorePosition("Debbie", calculateHighScorePosition(50));
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score is" + finalScore);
            return finalScore;
        }

        return -1; //default return to indicate an error
    }


    private static void displayHighScorePosition(String name, int position) {
        System.out.println("player: " + name + " managed to get into position: " + position);
    }

    private static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;

    }
}