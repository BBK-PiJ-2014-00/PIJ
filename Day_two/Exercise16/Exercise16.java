/****************************************************************************************************************************
* Day One: Exercise 16                                                                                                      *
* Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,     *
* RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.       *
* Make the program accept inputs until one player’s score is more than 3 points ahead of the other.                         *
* Hint: remember that you can use .substring() to get the elements of a String.                                             *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/
import java.util.Scanner;

public class Exercise16{
	//method that reads input from the Console
	public static String readInputFromConsole(String message){
		Scanner sc = new Scanner(System.in);	
		String userInput = "";
		try{
			System.out.println(message);
			userInput = sc.next();	
		}catch(Exception e){
        		System.err.println("There has been a problem, please try again!");
			System.exit(91); // Exit with error code 91
        	}
		/*if(!(userInput.equals("PP") || userInput.equals("PR") || userInput.equals("PS") || 
			userInput.equals("RP") || userInput.equals("RR") || userInput.equals("RS") || 
			userInput.equals("SP") || userInput.equals("SR") || userInput.equals("SS") )){
			
			System.out.println("Invalid Input. Exiting program.");
			System.exit(91);// exiting if input is not valid.
		}*/
		return userInput;
	}
	
	public static void validateUserInput(String st){
	
		if(!(st.equals("PP") || st.equals("PR") || st.equals("PS") || 
			st.equals("RP") || st.equals("RR") || st.equals("RS") || 
			st.equals("SP") || st.equals("SR") || st.equals("SS") )){
			
			System.out.println("Invalid Input. Exiting program.");
			System.exit(91);// exiting if input is not valid.
		}
	}
	
	
	public static void main(String args[]){
		String userInput;
		int firstUserWinCount = 0, secondUserWinCount = 0;
		boolean carryOnPlaying = true;
		String userInputMessage = "Please enter the selections made by two users in the format  PP, PR, PS, RP, RR, RS, SP, SR, or SS. \n Any different input will cause the program to exit.";
		
		while( carryOnPlaying){
			userInput = readInputFromConsole(userInputMessage);
			validateUserInput(userInput);
			if(userInput.equals("PR") || userInput.equals("RS") || userInput.equals("SP")){
				System.out.println("\nThe first player wins!");
				firstUserWinCount++;
			}
			else if(userInput.equals("PS") || userInput.equals("RP") || userInput.equals("SR")){
				System.out.println("\nThe second player wins!");
				secondUserWinCount++;
			}
			else if(userInput.equals("PP") || userInput.equals("RR") || userInput.equals("SS")){
				System.out.println("\nDraw!");
			}
			if(!(firstUserWinCount < 3 && secondUserWinCount <3 ))
				carryOnPlaying = false;
		}
		
		if(firstUserWinCount == 3)
			System.out.println("FIRST PLAYER WON!!!");
		else
			System.out.println("SECOND PLAYER WON!!!");
	}	
}