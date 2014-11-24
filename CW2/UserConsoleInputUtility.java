/****************************************************************************************************************************
* Day Four: Exercise  7                                                                                                     *
* Write a program that reads a text from the user and then enter a loop of requesting letters and counting them.            *
* The program stops if the user asks for the same letter twice. This is an example of the output of such a program          *
* (with a rather short and boring text):                                                                                    *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

import java.util.Scanner;

public class UserConsoleInputUtility{

	//method that reads a line of text from the command
	public String readLineFromConsole(){
		Scanner sc = new Scanner(System.in);	
		String userInput = "";
		try{
			userInput = sc.nextLine();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
	
	//method that reads input from the Console
	public double readDoubleFromConsole(){
		Scanner sc = new Scanner(System.in);	
		double userInput = 0;
		try{
			userInput = sc.nextDouble();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
	
	public int readIntFromConsole(){
		Scanner sc = new Scanner(System.in);	
		int userInput = 0;
		try{
			userInput = sc.nextInt();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
}