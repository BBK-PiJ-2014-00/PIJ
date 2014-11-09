/******************************************************************************************************
* Day One: Exercise 7                                                                                 *
* Write a program that reads three numbers and prints them in order, from lowest                      *
* to highest.                                                                                         *
*                                                                                                     *
* Author: Tadiwos Taddese                                                                             *
*******************************************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Exercise7{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
     	int[] input = new int[3];
	
	
	//Prompt user for an input and read input as an integer
	
	//userInput = sc.nextInt();
	try{
		for(int i = 0; i < input.length; i++){
			System.out.println("Please enter your input number " + i + 1 +":");
			input[i] = sc.nextInt();
		}
	}catch(Exception e){
        	System.err.println("There has been a problem, please try again!");
		System.exit(91); // Exit with error code 91
        }

	System.out.println("\n\tYour input - Unsorted:");
	for(int i : input)// printing the input in the order they were input
		System.out.println(i);
	
	Arrays.sort(input);
	System.out.println("\n\n\tYour input - Sorted:");
	for(int i : input)// printing the input in sorted order 
		System.out.println(i);
	}
}