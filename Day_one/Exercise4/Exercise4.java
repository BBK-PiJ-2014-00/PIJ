/******************************************************************************************************
* Day One: Exercise 4                                                                                 *
* Write a program that asks a number from the user, then says whether the                             *
* number is prime or not. Remember that a number that is divisible by any                             *
* number apart from 1 and itself is prime. You can use the modulo operator (if                        *
* a % b is zero, then a is divisible by b).                                                           *
*******************************************************************************************************/
import java.util.Scanner;


public class Exercise4{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
     	int userInput = 0;
     	int j = 2;
      	boolean isPrime = true;

	//Prompt user for an input and read input as an integer
	System.out.println("Please enter a positive number");
	//userInput = sc.nextInt();
	try{
			userInput = sc.nextInt();
	}catch(Exception e){
        	System.err.println("There has been a problem, please try again!");
		System.exit(91); // Exit with error code 91
        }

	while(j < userInput/2){
		if(userInput%j == 0){
			isPrime = false;
		}
		j++;
	}

	
	if (!isPrime)
		System.out.println("The number you entered is " + userInput + " and it's not a prime number.");
	else
		System.out.println("The number you entered is " + userInput + " and it's a prime.");
	}
}