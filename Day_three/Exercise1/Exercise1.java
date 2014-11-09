/****************************************************************************************************************************
* Day One: Exercise 1                                                                                                     *
* Write a program that reads two numbers from the user and then offers a menu with the four basic operations:               *
* addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the           *
* calculator performs the operation.                                                                                        *
* Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou-ble.parseDouble()  *
* method to parse real numbers.                                                                                             *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

public class Exercise1{
	//method that reads input from the Console
	public static void main(String[] args){
			Calculator calc = new Calculator();
			boolean calcMore = true;
			
			while(calcMore){			
				UserConsoleInputUtility uciu = new UserConsoleInputUtility();
				calc.setOperand1(uciu.readInputFromConsole("Please enter the First Operand."));
				calc.setOperand2(uciu.readInputFromConsole("Please enter the Second Operand."));
				calc.setOperator(uciu.readInputFromConsole("Please enter 1 ,2 ,3 , 4 for +, - , * or / respectively."));
				calc.performCalculation();
				System.out.println("\n\tFirst Operand = " + calc.getOperand1() + "\n\tSecond Operand = " + calc.getOperand2() +
										"\n\tOperator = " + calc.getOperator() + "\n\t****************************" + 
										"\n\t\tResult = " + calc.getResult() + "\n\t****************************");
				double temp = uciu.readInputFromConsole("Please enter 9 to do more calculations.");
				if(temp != 9)
					calcMore = false;			
			}
	}
}