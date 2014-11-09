/******************************************************************************************************
* Day One: Exercise 6                                                                                 *
* Write a program that requests two numbers from the user and then outputs the                        *
* quotient and the remainder, e.g. if the user enters 7 and 3, your program should                    *
* ouput something like “7 divided by 3 is 2, remainder 1”. You cannot use the                         *
* “/” or “%” operators.                                                                               *
*                                                                                                     *
* Author: Tadiwos Taddese                                                                             *
*******************************************************************************************************/
import java.util.Scanner;


public class Exercise6{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
     	int quotient = 0, dividend =0, divisor = 0, remainder = 0;
	
	
	//Prompt user for an input and read input as an integer
	
	//userInput = sc.nextInt();
	try{
		System.out.println("Please enter the dividend:");
			dividend = sc.nextInt();
		System.out.println("Please enter the divisor:");
			divisor = sc.nextInt();
	}catch(Exception e){
        	System.err.println("There has been a problem, please try again!");
		System.exit(91); // Exit with error code 91
        }

	int temp1_var= dividend;
	
	while(temp1_var >= divisor){
		temp1_var = temp1_var - divisor;
		quotient++;
	}
	remainder = temp1_var;
	System.out.println(dividend + " divided by " + divisor + " equals " + quotient +" with a remainder of " +  remainder);
	}
}