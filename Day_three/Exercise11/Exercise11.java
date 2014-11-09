	/************************************************************************************************************************
* Day Four: Exercise  11                                                                                                    *
* Write a program that reads a number with commas and decimal dots (such as 23,419.34) and then prints a                    *
* number that is half of it. Do not use Double.parseDouble().                                                               *
* If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.                        *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise11{

	public static void main(String args[]){
			
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		String  userInput = util.readLineFromConsole("Please enter a line of text.");
		String commasRemoved;
		int decLoc;
		double value = 0.0;
		
		
		System.out.println("You entered :" + userInput);
		commasRemoved = userInput.replaceAll(",","");
		
		decLoc = commasRemoved.indexOf(".") != -1 ? commasRemoved.indexOf("."): commasRemoved.length();
		System.out.println("Decimal location :" + decLoc + " Length = " + commasRemoved.length());
		
		for(int j = commasRemoved.length() - 1;  j >= 0;  j--){
			if(Character.isDigit(commasRemoved.charAt(j)))
			{
				
			}
		}
		/*
		if(isPalindrome)
		{
			System.out.println("You entered = \'" + userInput + "\'. It\'s a palindrome");
		}
		else
		{
			System.out.println("You entered = \'" + userInput + "\'. It\'s not a palindrome");
		}*/
	}
}