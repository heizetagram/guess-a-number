/*
A game where the user has three attempts to guess which number between 1-10, the computer is thinking of.
Created by Jafar, Oliver, and David
 */

import java.util.Random;
import java.util.Scanner;

public class guessANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Creates a Scanner var
        Random random = new Random(); //Creates a Random var

        System.out.println("Which number between 1-10 am I thinking of? \nYou have three attempts!"); //Prints...
        int randomNumber = random.nextInt(10) + 1; //Creates an int var and assigns it the value of a random number between 1-10
        int attempts = 0; //Creates an int var with the value 0

        while (attempts < 3) { //Keep running the code below as long as the value of 'attempts' is less than 3
            if (scan.hasNextInt()) { //Checks if the next user input is an integer
                int userGuess = scan.nextInt(); //Creates int var that prompts user for int input

                if (userGuess < 1 || userGuess > 10) { //If the user input is lower than 1 OR greater than 10, the following statement will print
                    System.out.println("Your guess must be between 1-10, try again.");
                } else if (userGuess == randomNumber) { //If user input equals 'randomNumber', print the statement below and stop the code
                    System.out.println("That is correct!");
                    break; //Breaks the loop
                } else if (userGuess > randomNumber) { //Else if the user input is greater than 'randomNumber', print the statement below
                    System.out.println("No, it is lower.");
                    attempts++; //Add value +1 to 'attempts'
                } else { //Else if the user input is lower than 'randomNumber', print the statement below
                    System.out.println("No, it is higher.");
                    attempts++; //Add value +1 to 'attempts'
                }

                if (attempts == 3) { //If the value of 'attempts' reaches 3, the statement below will print
                    System.out.println("\nI was thinking of the number " + randomNumber + ". You lose!");
                }

            } else { //If user input isn't an integer, the following statement will print
                System.out.println("Input MUST be an integer, try again.");
                scan.nextLine(); //Clears any previous input and starts fresh
            }
        }
    }
}
