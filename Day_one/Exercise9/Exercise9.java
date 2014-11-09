/******************************************************************************************************
* Day One: Exercise 9                                                                                 *
* Read an arbitrarily long sequence of positive numbers from the user, until -1                       *
* is entered. At that point, print ”Yes” if the numbers were consecutive and                          *
* increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-                        *
* 1” should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”. *                                                                                       *
*                                                                                                     *
* Author: Tadiwos Taddese                                                                             *
*******************************************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Exercise9{
	
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
		int input;
		String allInput = "";
		String[] allInputString; // String array format of the user input.
		int count = 0, registeredDiff = 0, previousValue = 0;
		boolean isConsecutive = true;
		input = readIntFromConsole("Please enter a number!");
		while(input != -1){
			allInput = input + " " + allInput;
			if(count == 0){
				previousValue = input;
			}
			else if(count == 1){
				registeredDiff = input - previousValue;
				previousValue = input;
			}
			else{
				if (registeredDiff !=  input - previousValue)
					isConsecutive = false;
				previousValue = input;			
			}
			input = readIntFromConsole("Please enter a number!");
			count++;
		}

		System.out.println("You entered the following numbers: " + allInput);
		if(isConsecutive)
			System.out.println("The numbers are consecutive!");
		else
			System.out.println("The numbers are not consecutive!");
	}

	
}