package com.Pyramid;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name ;
        int guessNumber ;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        name = inputScanner.nextLine();
        System.out.println(" Well,  "+name+"  I am thinking of a number between 1 and 20.  Take a guess.");
        guessNumber = Integer.parseInt(inputScanner.nextLine());
        Random random = new Random();
        int number = random.nextInt(20) + 1;
        String yesno = "y";
        do{
            do {
                if (guessNumber > number) {
                    System.out.println("Your guess is too high.  Take a guess.");
                    guessNumber = Integer.parseInt(inputScanner.nextLine());
                } else if (guessNumber < number) {
                    System.out.println("Your guess is too low.  Take a guess.");
                    guessNumber = Integer.parseInt(inputScanner.nextLine());
                } else
                    break;
            }
            while(guessNumber==number);

            System.out.println("Good job, "+name+"! You guessed my number in 3 guesses!  Would you like to play again? (y or n)");
            yesno = inputScanner.nextLine();
        } while((yesno.equals("y")));

        }
    }
