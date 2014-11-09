/****************************************************************************************************************************
* Day Four: Exercise  4                                                                                                     *
* Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.             *
* Then modify the program so that it reads the text from the user and then asks for a letter. The program should            *
* then say how many times you can find the letter in the text.                                                              *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise6{

	public static void main(String args[]){
		
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String userInput1 = util.readLineFromConsole("Please enter a line of text.");
		System.out.println("\nPrinting how many e\'s in the text of line.");
		String userInput2 = util.readLineFromConsole("Please enter a character you wish to search for.");
		
		int countW = 0;
		for (int i=0; i < userInput1.length(); i++)
		{
			if( userInput1.charAt(i) == userInput2.charAt(0))
			{
				int temp = 0;
				for (int j = 0; j < userInput2.length(); j++)
				{
				System.out.println("Here " + j + " " + i);
					if(userInput1.charAt(i + j) == userInput2.charAt(j))
						temp++;
				}
				if(temp == userInput2.length()){
					countW++;
					System.out.println("Count = " + countW);
				}
			}		
		}
		System.out.println("\nNumber of \'" + userInput2 + "\' in the text \'" + userInput1 + "' is : " + countW);
	}
}