/****************************************************************************************************************************
* Day One: Exercise 16                                                                                                      *
* Write a program that reads two numbers from the user and then offers a menu with the four basic operations:               *
* addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the           *
* calculator performs the operation.                                                                                        *
* Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou-ble.parseDouble()  *
* method to parse real numbers.                                                                                             *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/
import java.util.Scanner;

public class UserConsoleInputUtility{
	//method that reads input from the Console
	public double readInputFromConsole(String message){
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