	/****************************************************************************************************************************
* Day Four: Exercise  8                                                                                                     *
* A strict palindrome is difficult to see in every day language. A relaxed palindrome, a text that is a palindrome if       *
* you ignore punctuation marks such as commas or spaces, is easier to see. Examples include A man, a plan, a canal          *
* - Panama!, Was it a car or a cat I saw?, and “Rise to vote, sir.                                                          *
* Write a program that reads a text from the user and then says whether the text is a relaxed palindrome. Note              *
* that all strict palindromes are relaxed palindromes by definition.                                                        *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise10{

	public static void main(String args[]){
			
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String  userInput = util.readLineFromConsole("Please enter a line of text.");
		boolean isPalindrome = true;
		int varLength = userInput.length() / 2; // variable that will be assigned 0 for even number(s) of character input by the user or else 1

		for(int j = userInput.length() - 1, i = 0; j >= 0 && i < userInput.length();  j--, i++){
			while(!Character.isLetter(userInput.charAt(j)) && j >= 0 )
				j--;
			while(!Character.isLetter(userInput.charAt(i)) && i < userInput.length())
				i++;
				
			if( Character.toLowerCase(userInput.charAt(j)) != Character.toLowerCase(userInput.charAt(i))){
				isPalindrome = false;
				System.out.println(j+ " j = " + userInput.charAt(j) + " and i = " + userInput.charAt(i) + " " + i);
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