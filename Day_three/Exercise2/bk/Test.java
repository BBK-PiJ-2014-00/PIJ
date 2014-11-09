/****************************************************************************************************************************
* Day One: Exercise 2                                                                                                       *
* Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two             *
* operands, and then execute it. For example,  the user enters 3/5 the program outputs 0.6; if the user                     *
* enters 23 * 4 the program outputs 92.                                                                                     *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Test{

	public static void main(String args[]){
		String userInput = "0123456789";
		
		System.out.println(userInput.length());
		System.out.println(userInput.indexOf('1'));
		System.out.println(userInput.substring(0, userInput.indexOf('1')));
		System.out.println(userInput.substring(userInput.indexOf('1') + 1, userInput.length()));
	}
}