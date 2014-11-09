/******************************************************************************************************
* Day One: Exercise 8                                                                                 *
* Write a program that read a (arbitrarily long) sequence of positive numbers.                        *
* The sequence is ended when the users enters “-1”. At that point, the program                        *
* must output the highest number in the sequence.                                                     *                                                                                       *
*                                                                                                     *
* Author: Tadiwos Taddese                                                                             *
*******************************************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Exercise8{
	
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
		int[] allInputInt; //Int array format of the user input.	
		input = readIntFromConsole("Please enter a number!");
		while(input != -1){
			allInput = input + ":" + allInput;
			input = readIntFromConsole("Please enter a number!");
		}

		System.out.println("Total input = " + allInput);

		allInputString = allInput.split(":");
		System.out.println("\n\tYour input - Unsorted:	");
		for(int i = 0; i < allInputString.length; i++)// printing the input in the order they were input
			System.out.println(allInputString[i]);
		System.out.println("Done printing of unsorted");

		allInputInt = new int[allInputString.length];
		for(int i = 0; i < allInputString.length; i++ ){//
			allInputInt[i] = Integer.parseInt(allInputString[i]);
			System.out.println(i + ", " + allInputInt[i]);
		}
		System.out.println("\n\tYour input - Unsorted:");
		for(int i : allInputInt)// printing the input in the order they were input
			System.out.println(i);

		Arrays.sort(allInputInt);
		
		System.out.println("\n\tYour input - Sorted descending order:");
		for(int i = allInputInt.length-1; i >= 0; i-- )// 
			System.out.println(allInputInt[i]);
	}

	
}