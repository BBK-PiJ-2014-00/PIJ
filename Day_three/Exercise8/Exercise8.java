/****************************************************************************************************************************
* Day Four: Exercise  8                                                                                                     *
* A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either                *
* direction. Examples of strict palindromes include ABBA, madam, radar, kayak, and step on no pets.                         *
* Write a program that reads a text and detects whether the text is a strict palindrome.                                    *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise8{

	public static void main(String args[]){
			
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String  userInput = util.readLineFromConsole("Please enter a line of text.");
		boolean isPalindrome = true;
		int varLength = userInput.length() / 2; // variable that will be assigned 0 for even number(s) of character input by the user or else 1

		for(int j = userInput.length() - 1, i = 0; j >= 0 && i < userInput.length();  j--, i++){
			if( userInput.charAt(j) != userInput.charAt(i)){
				isPalindrome = false;
			}
		}
				
		if(isPalindrome)
		{
			System.out.println("You entered = \'" + userInput + "\'. It\'s a palindrome");
		}
		else
		{
			System.out.println("You entered = \'" + userInput + "\'. It\'s not a palindrome");
		}
	}
}