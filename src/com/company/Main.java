package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        // Contains the main Blackjack game
        while (true) {
            // Creates the original random numbers
            int rand1 = random.nextInt(11) + 1;
            int rand2 = random.nextInt(11) + 1;
            int rand3 = random.nextInt(11) + 1;
            int rand4 = random.nextInt(11) + 1;
            // Adds up the original numbers
            int secret = rand1 + rand2;
            int userNum = rand3 + rand4;
            // Asks if you want another card
            while (userNum<22 && secret<22) {
                System.out.println("You have " + userNum);
                System.out.println("Do you want to get another card : y/n");
                String answer = input.next();
                if (answer.equals("y")) {
                    int rand6 = random.nextInt(11) + 1;
                    userNum += rand6;
                }else if(answer.equals("n")) break;
                int flip = random.nextInt(2);
                if (flip == 1) {
                    int rand5 = random.nextInt(11) + 1;
                    secret += rand5;
                }
            }
            // Checks if you have won or lost
            if (userNum < 22 && secret < 22) {
                if (userNum > secret) {
                    System.out.println("You won!!");
                } else {
                    System.out.println("The computer won!!");
                }
            } else if (userNum > 21) {
                System.out.println("The computer won!!");
            } else {
                System.out.println("You won!!");
            }
            // Prints result
            System.out.println("You got " + userNum);
            System.out.println("The computer got " + secret);

            System.out.println("Do you want to play again: y/n");
            String answer2 = input.next();
            if (answer2.equals("n")) break;
        }
    }
}
