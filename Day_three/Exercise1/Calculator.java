/****************************************************************************************************************************
* Day One: Exercise 16                                                                                                      *
* Write a program that reads two numbers from the user and then offers a menu with the four basic operations:               *
* addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the           *
* calculator performs the operation.                                                                                        *
* Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou-ble.parseDouble()  *
* method to parse real numbers.                                                                                             *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/
import java.util.Scanner;

public class Calculator{
	private double operand1, operand2, result;
	private char operator;
	
	/*public Calculator(double op1, double op2, char oper){
		this.operand1 = op1;
		this.operand2 = op2;
		this.operator = oper;
	}*/
	
	public double getOperand1(){
		return this.operand1;
	}	
	public double getOperand2(){
		return this.operand2;
	}
	public char getOperator(){
		return this.operator;
	}
	public double getResult(){
		return this.result;
	}
	
	public void setOperator(double oper){
		System.out.println("You entered :" + oper);
		switch ( (int)oper ) {
			case 1 : 
				this.operator = '+';
				break;
			case 2 : 
				this.operator = '-';
				break;
			case 3 : 
				this.operator = '*';
				break;
			case 4 : 
				this.operator = '/';
				break;
			default :
				System.out.println(" Invalid Operator entered.");
		}
	}
	public void setOperand1(double op1){
		this.operand1 = op1;
	}
	public void setOperand2(double op2){
		this.operand2 = op2;
	}
	public void setResult(double res){
		this.result = res;
	}
	
	public void addition(){
		this.setResult(getOperand1() + getOperand2());
	}
	public void subtraction(){
		setResult(getOperand1() - getOperand2());
	}
	public void multiplication(){
		setResult(getOperand1() * getOperand2());
	}
	public void division(){
		setResult(getOperand1() / getOperand2());
	}
	
	public void performCalculation(){

		switch ( this.getOperator() ){
			case '+' :
				this.addition();
				break;
			case '-' :
				this.subtraction();
				break;
			case '*' : 
				this.multiplication();
				break;	
			case '/' :
				this.division();
				break;
			default :
				System.out.println("There has been a problem, please try again!");
				break;
		}
	}
}