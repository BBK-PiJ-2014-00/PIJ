/****************************************************************************************************************************
* Day Four: Exercise  4                                                                                                     *
* Write a program that reads some text from the user and then writes the same text on screen, but each letter on a          *
* different line.                                                                                                           *
* Now modify your program to write each word (as defined by spaces) rather than letter on a different line.                 *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise4{

	public static void main(String args[]){
		
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String userInput = util.readLineFromConsole("Please enter a line of text(1).");
		
		System.out.println("\nPrinting a character per line.");
		for(int i = 0; i < userInput.length(); i++){
			System.out.println(userInput.charAt(i));
		}
		
		String[] words = userInput.split(" ");
		System.out.println("\nPrinting a word per line.");
		for(String w : words)
			System.out.println(w);		
	}
}