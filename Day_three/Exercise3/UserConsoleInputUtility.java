/****************************************************************************************************************************
* Day Three: Exercise 3                                                                                                     *
* Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your               *
* program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,      *
* 0.10, 0.05, 0.02, 0.01) needed.                                                                                           *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

import java.util.Scanner;

public class UserConsoleInputUtility{

	//method that reads a line of text from the command
	public String readLineFromConsole(String message){
		Scanner sc = new Scanner(System.in);	
		String userInput = "";
		try{
			System.out.println(message);
			userInput = sc.next();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
	
	//method that reads input from the Console
	public double readDoubletFromConsole(String message){
		Scanner sc = new Scanner(System.in);	
		double userInput = 0;
		try{
			System.out.println(message);
			userInput = sc.nextDouble();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
}