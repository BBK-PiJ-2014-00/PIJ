/****************************************************************************************************************************
* Day One: Exercise 2                                                                                                       *
* Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two             *
* operands, and then execute it. For example,  the user enters 3/5 the program outputs 0.6; if the user                     *
* enters 23 * 4 the program outputs 92.                                                                                     *
*                                                                                                                           *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/

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