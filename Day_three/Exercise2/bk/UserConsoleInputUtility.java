/****************************************************************************************************************************
* Day One: Exercise 2                                                                                                       *
* Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two             *
* operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”; if the user               *
* enters “23 * 4” the program outputs “92”.                                                                                 *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
*****************************************************************************************************************************/
import java.util.Scanner;

public class UserConsoleInputUtility{

/*	//method that reads a line of text from the command
	public String readLineFromConsole(String message){
		Scanner sc = new Scanner(System.in);	
		int userInput = "";
		try{
			System.out.println(message);
			userInput = sc.next();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        }
		return userInput;
	}
	*/
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