/******************************************************************************************************
* Day One: Exercise 4                                                                                 *
* Write a program that requests two numbers from the user and then outputs its                        *
* product. You cannot use the “*” operator.                                                           *
*                                                                                                     *
* Author: Tadiwos Taddese                                                                             *
*******************************************************************************************************/
import java.util.Scanner;


public class Exercise5{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
     	int userInput2 =0, userInput1 = 0, product = 0;
	
	
	//Prompt user for an input and read input as an integer
	System.out.println("Please enter a positive number");
	//userInput = sc.nextInt();
	try{
			userInput1 = sc.nextInt();
			userInput2 = sc.nextInt();
	}catch(Exception e){
        	System.err.println("There has been a problem, please try again!");
		System.exit(91); // Exit with error code 91
        }

	for(int i = 0; i < userInput1; i++){
		for(int j =0; j < userInput2; j++){
			product++;
		}
	}
	
	System.out.println("The product of " + userInput1 + " and " + userInput2 + " is " + product);
	}
}