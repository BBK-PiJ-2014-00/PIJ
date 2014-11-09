/****************************************************************************************************************************
* Day Three: Exercise 3                                                                                                     *
* Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your               *
* program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,      *
* 0.10, 0.05, 0.02, 0.01) needed.                                                                                           *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise3{

	public static void main(String args[]){
		final double fiftyPound = 5_000;
		final double twentyPound = 2_000;
		final double tenPound = 1_000;
		final double fivePound = 500;
		final double twoPound = 200;
		final double onePound = 100;
		final double fiftyPence = 50;
		final double twentyPence = 20;
		final double tenPence = 10;
		final double fivePence = 5;
		final double twoPence = 2;
		final double onePence = 1;

		UserConsoleInputUtility util = new UserConsoleInputUtility();
		
		double amountPaid = util.readDoubletFromConsole("Please enter the amount of money paid, in the format 99.99.");
		double totalCost = util.readDoubletFromConsole("Please enter the total cost, in the format 99.99.");
		double change = amountPaid - totalCost, tempChange = 0.00;
		String message = "\nYou Paid :" + amountPaid + "\nTotal Cost : " + totalCost + "\nChange Due : " + change;
		change = change * 100; // multiply by 100 to convert to pence
		
		if( change > fiftyPound){
			int temp = (int)(change / fiftyPound);
			message = message + "\n50 Pound(s) : " + temp;
			change = change - (temp * fiftyPound);
		}
		else{
			message = message + "\n 50 Pound(s) : 0";
		}
		
		if( change > twentyPound){
			int temp = (int)(change / twentyPound);
			message = message + "\n20 Pound(s) : " + temp;
			change = change - (temp * twentyPound);
		}
		else{
			message = message + "\n 20 Pound(s) : 0";
		}
		
		if( change > tenPound){
			int temp = (int)(change / tenPound);
			message = message + "\n10 Pound(s) : " + temp;
			change = change - (temp * tenPound);
		}
		else{
			message = message + "\n10 Pound(s) : 0";
		}
		
		if( change > fivePound){
			int temp = (int)(change / fivePound);
			message = message + "\n5 Pound(s) : " + temp;
			change = change - (temp * fivePound);
		}
		else{
			message = message + "\n 5 Pound(s) : 0";
		}
		
		if( change > twoPound){
			int temp = (int)(change / twoPound);
			message = message + "\n2 Pound(s) : " + temp;
			change = change - (temp * twoPound);
		}
		else{
			message = message + "\n2 Pound(s) : 0";
		}
		
		if( change > onePound){
			int temp = (int)(change / onePound);
			message = message + "\n1 Pound(s) : " + temp;
			change = change - (temp * onePound);
		}
		else{
			message = message + "\n1 Pound(s) : 0";
		}
		
		if( change > fiftyPence){
			int temp = (int)(change / fiftyPence);
			message = message + "\n50 Pence(s) : " + temp;
			change = change - (temp * fiftyPence);
		}
		else{
			message = message + "\n50 Pence(s) : 0";
		}
		
		if( change > twentyPence){
			int temp = (int)(change / twentyPence);
			message = message + "\n20 Pence(s) : " + temp;
			change = change - (temp * twentyPence);
		}
		else{
			message = message + "\n20 Pence(s) : 0";
		}
		
		if( change > tenPence){
			int temp = (int)(change / tenPence);
			message = message + "\n10 Pence(s) : " + temp;
			change = change - (temp * tenPence);
		}
		else{
			message = message + "\n10 Pence(s) : 0";
		}
		
		if( change > fivePence){
			int temp = (int)(change / fivePence);
			message = message + "\n5 Pence(s) : " + temp;
			change = change - (temp * fivePence);
		}
		else{
			message = message + "\n5 Pence(s) : 0";
		}
		
		if( change > twoPence){
			int temp = (int)(change / twoPence);
			message = message + "\n2 Pence(s) : " + temp;
			change = change - (temp * twoPence);
		}
		else{
			message = message + "\n2 Pence(s) : 0";
		}
		
		if( change > onePence){
			int temp = (int)(change / onePence);
			message = message + "\n1 Pence(s) : " + temp;
			change = change - (temp * onePence);
		}
		else{
			message = message + "\n1 Pence(s) : 0";
		}
		
		
		System.out.println(message + "\n" +change);
		
	}
}