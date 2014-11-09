/****************************************************************************************************************************
* Day Four: Exercise  7                                                                                                     *
* Write a program that reads a text from the user and then enter a loop of requesting letters and counting them.            *
* The program stops if the user asks for the same letter twice. This is an example of the output of such a program          *
* (with a rather short and boring text):                                                                                    *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise7{

	public static void main(String args[]){
			
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		int countW = 0;
		boolean keepRunning = true;
		String searches = "";
		String userInput1 = util.readLineFromConsole("Please enter a line of text.");
		String userInput2 = util.readLineFromConsole("Please enter a character you wish to search for.");
		
		while(keepRunning){
			countW = (userInput1.length() - userInput1.replace(userInput2, "").length())/userInput2.length();
			System.out.println("\nNumber of \'" + userInput2 + "\' in the text \'" + userInput1 + "' is : " + countW);
			searches = searches + userInput2;
			countW = 0;
			userInput2 = util.readLineFromConsole("Please enter a character you wish to search for.");
			
			//System.out.println("The searches so far : " + searches);
			if ( (searches.length() - searches.replace(userInput2, "").length()) != 0 )
				keepRunning = false;
		}
	}
}