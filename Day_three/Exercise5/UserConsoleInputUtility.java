/****************************************************************************************************************************
* Day Four: Exercise  4                                                                                                     *
* Write a program that reads some text from the user and then writes the same text on screen, but each letter on a          *
* different line.                                                                                                           *
* Now modify your program to write each word (as defined by spaces) rather than letter on a different line.                 *
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
			userInput = sc.nextLine();	
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