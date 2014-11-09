/*****************************************************************************************************************
* Day One: Exercise 15                                                                                           *
*  Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it.    *
* For every guess, the computer says whether the guess is correct, or too low, or too high. When the user finds  *
* the number, the computer will tell how many guesses were needed. The output could be similar to the following  *
* example:                                                                                                       *
* Try to guess my number!                                                                                        *
* Tell me a number: 2                                                                                            *
* No! My number is higher.                                                                                       *
* Tell me a number: 800                                                                                          *
* No! My number is lower.                                                                                        *
* Tell me a number: 500                                                                                          *
* No! My number is lower.                                                                                        *
* Tell me a number: 350                                                                                          *
* No! My number is higher.                                                                                       *
* Tell me a number: 376                                                                                          *
* CORRECT!                                                                                                       *
* You needed 5 guesses.                                                                                          *
* Author: ttadde01                                                                                               *
*****************************************************************************************************************/
import java.util.Scanner;

public class Exercise15{
	//method that reads input from the Console
	public static int readIntFromConsole(String message){
		Scanner sc = new Scanner(System.in);	
		int userInput = 0;
		try{
			System.out.println(message);
			userInput = sc.nextInt();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        	}
		return userInput;
	}
	
	
	public static void main(String args[]){
		int userInput = readIntFromConsole("\n\nPlease guess a number between 0 and 1000! TO GIVE UP ENTER -99\n\n");
		int numberToGuess = Math.abs((int)(1000 * Math.random())); \\ The static method random from Math class returns double value hence the casting
		while(userInput != numberToGuess){
			if(userInput > numberToGuess){
				System.out.println("\tPlease try again! Hint: My number is lower.");
			}
			else if(userInput == -99){// Not specified in exercise included just in case.
				System.out.println("\n\nYou have chosen to EXIT! BTW the number was " + numberToGuess + ".");
				System.exit(91);
			}
			else
			{
				System.out.println("\tPlease try again! Hint: My number is higher.");
			}
			userInput = readIntFromConsole("\nPlease guess a number between 0 and 1000! TO GIVE UP ENTER -99");
		}
		
		System.out.println("Well done!!!");
	}
}