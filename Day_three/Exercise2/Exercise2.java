/****************************************************************************************************************************
* Day One: Exercise 2                                                                                                       *
* Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two             *
* operands, and then execute it. For example,  the user enters 3/5 the program outputs 0.6; if the user                     *
* enters 23 * 4 the program outputs 92.                                                                                     *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise2{

	public static void main(String args[]){
		Calculator calc = new Calculator();
		String userInput;
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		
		userInput = util.readLineFromConsole("Write your text representing a mathematical operation in the format 2 * 3. \nUsing a single operator in: +, -, *, or /.");		
		System.out.println(userInput);
		if(userInput.indexOf('*') != -1){
			calc.setOperand1(Double.parseDouble(userInput.substring(0, userInput.indexOf('*'))));
			calc.setOperand2(Double.parseDouble(userInput.substring(userInput.indexOf('*')  + 1, userInput.length())));
			calc.setOperator('*');
		}
		else if(userInput.indexOf('+') != -1){
			calc.setOperand1(Double.parseDouble(userInput.substring(0, userInput.indexOf('+'))));
			calc.setOperand2(Double.parseDouble(userInput.substring(userInput.indexOf('+')  + 1, userInput.length())));
			System.out.println(Double.parseDouble(userInput.substring(0, userInput.indexOf('+'))));
			System.out.println(Double.parseDouble(userInput.substring(userInput.indexOf('+')  + 1, userInput.length())));
			calc.setOperator('+');
		}
		else if(userInput.indexOf('-') != -1){
			calc.setOperand1(Double.parseDouble(userInput.substring(0, userInput.indexOf('-'))));
			calc.setOperand2(Double.parseDouble(userInput.substring(userInput.indexOf('-')  + 1, userInput.length())));
			calc.setOperator('-');
		}
		else if(userInput.indexOf('/') != -1){
			calc.setOperand1(Double.parseDouble(userInput.substring(0, userInput.indexOf('/'))));
			calc.setOperand2(Double.parseDouble(userInput.substring(userInput.indexOf('/')  + 1, userInput.length())));
			calc.setOperator('/');
		}
		calc.performCalculation();
		System.out.println("\n\tFirst Operand = " + calc.getOperand1() + "\n\tSecond Operand = " + calc.getOperand2() +
										"\n\tOperator = " + calc.getOperator() + "\n\t****************************" + 
										"\n\t\tResult = " + calc.getResult() + "\n\t****************************");
		
	}
}