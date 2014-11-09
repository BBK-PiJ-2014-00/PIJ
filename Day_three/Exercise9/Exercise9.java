/****************************************************************************************************************************
* Day Four: Exercise  8                                                                                                     *
* A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either                *
* direction. Examples of strict palindromes include ABBA, madam, radar, kayak, and step on no pets.                         *
* Write a program that reads a text and detects whether the text is a strict palindrome.                                    *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise9{

	public static void main(String args[]){
			
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String palindrome, userInput = util.readLineFromConsole("Please enter a line of text.");
		int varLength = userInput.length() / 2; // variable that will be assigned 0 for even number(s) of character input by the user or else 1
		palindrome = userInput;
		for(int j = userInput.length() - varLength; j >= 0;  j--){
			System.out.println(j);
			palindrome = palindrome + userInput.charAt(j);
		}
		System.out.println("Welcome to create palindrome!");
		System.out.println("You entered = \'" + userInput + "\'.");
		System.out.println("The palindrome for your input is = \'" + palindrome + "\'.");
	}
}