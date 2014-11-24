/****************************************************************************************************************************
* CW2 FractionCalculator Class                                                                                              *
* Written by Tadiwos Taddese                                                                                                *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/
import java.util.*;
public class FractionCalculator{
	String userInput, operator = "+";
	ArrayList<String> userInputList = new ArrayList<String>();
	Fraction resultFraction = new Fraction(0,1);
	
	//getter and setter methods
	public String getUserInput(){
		return this.userInput;
	}
	
	public String getOperator(){
		return this.operator;
	}
	
	public ArrayList<String> getUserInputList(){
		return this.userInputList;
	}
	
	public Fraction getResultFraction(){
		return this.resultFraction;
	}
	
	public void setUserInput(String str){
		this.userInput = str;
	}
	
	public void setOperator(String str){
		this.operator = str;
	}
	
	public void setUserInputList(ArrayList<String> aList){
		this.userInputList = aList;
	}
	
	public void setResultFraction(Fraction fra){
		this.resultFraction = fra;
	}
	
	//constractor for class FractionCalculator
	public FractionCalculator(){
		this.userInput = "";
		this.userInputList = new ArrayList<String>();
		this.resultFraction = new Fraction(0, 1);
	}

	//Main menu
	public static String mainMenu(){
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		System.out.println("*********************************Tadiwos Taddese************************************************");
		System.out.println("* Command Line calculator.                                                                     *");
		System.out.println("************************************************************************************************");
		System.out.println("* Please enter:                                                                                *");
		System.out.println("* 1 - To enter single command per line.                                                        *");
		System.out.println("* 2 - To enter Multiple commands on a single line.                                             *");
		System.out.println("* Enter q, Q or quit to exit Command Line Calculator.                                          *");
		System.out.println("************************************************************************************************");			   
		System.out.println("* Please make your selection:                                                                  *\n\n");
		return util.readLineFromConsole();
	}
	
	//Menu for single command option. 
	public static String singleCommandMenu(){
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		System.out.println("*********************************Tadiwos Taddese************************************************");
		System.out.println("* Single Command Option.                                                                       *");
		System.out.println("************************************************************************************************");
		System.out.println("* You may use +, -, *, /, a, A, abs, n, N, neg, c, C, clear.                                   *");
		System.out.println("* Enter q, Q or quit to exit single command mode.                                              *");
		System.out.println("************************************************************************************************");			   
		System.out.println("* Please make your selection:                                                                  *\n\n");
		return util.readLineFromConsole();
	}
	
	
	//Menu for Multiple command option
	public static String multipleCommandMenu(){
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		System.out.println("*********************************Tadiwos Taddese************************************************");
		System.out.println("* Multiple Command Option.                                                                     *");
		System.out.println("************************************************************************************************");
		System.out.println("* Mixture of numbers and operators, separated by spaces,                                       *");
		System.out.println("* For example, 3/4 + 1/-3 * 7 / 5                                                              *");
		System.out.println("* Enter q, Q or quit to exit multiple Command mode.                                            *");
		System.out.println("************************************************************************************************");			   
		System.out.println("* Please make your selection:                                                                  *\n\n");
		return util.readLineFromConsole();
	}
	
	
	// method used to valide user input.
	public String validateUserInput(String usrInput){
		
		switch(usrInput){
			case "*":
			case "/":
			case "+":
			case "-":
			case "A":
			case "ABS":
			case "N":
			case "NEG":
			case "C":
			case "CLEAR":
			case "Q":
			case "QUIT":
				break;
			default:
				try{
					Integer.parseInt( usrInput.replace("-", "").replace("/", ""));
				}
				catch(NumberFormatException nfe){
					System.out.println("\nInvalid input : " + usrInput + ". No action will be taken.");
					return "";
				}
				break;
		}
		return usrInput;
	}
	
	//method used to reset the calculator objects
	public  void clearCalculator (){
		this.userInput = "";
		this.operator = "+";
		this.userInputList = new ArrayList<String>();
		this.resultFraction.setNumerator(0);
		this.resultFraction.setDenominator(1);
	}
	
	//method used to do *, /, +, - 
	public Fraction evaluate(Fraction fraction, String inputString){
		Fraction result = new Fraction(0, 1);
		switch (this.operator){
			case "*":
				result = fraction.multiply(new Fraction(inputString));
				break;
			case "/":
				result = fraction.divide(new Fraction(inputString));
				break;
			case "+":
				result = fraction.addition(new Fraction(inputString));
				break;
			case "-":
				result = fraction.subtract(new Fraction(inputString));
				break;
			//default:
		}
		return result;
	}
	
	//method used to do absolute value and negate
	public Fraction evaluateFunction(String inputFunction){
		Fraction result = new Fraction(0, 1);
		switch (inputFunction){
			case "A":
			case "ABS":
				result = this.resultFraction.absValue();
				break;
			case "N":
			case "NEG":
				result = this.resultFraction.negate();
				break;
		}
		return result;
	}
	
	
	//method used to evalute multiple commands passed as a Sting object. For instance '3/4 + 1/-3 * 7 / 5 + -2/5 a / 3/8 n'
	public Fraction evaluateMultiple(String userInputM){
		String userInputArray[] = userInputM.split("\\s+");
		Fraction result = new Fraction("0");
		/*Array to ArrayList conversion*/
		this.userInputList= new ArrayList<String>(Arrays.asList(userInputArray));
		
		//for (int i = 0; i < userInputArray.length; i++)
		//boolean moreMulti_Or_Div = true;
		int i = 0;
		while(userInputList.size() > 1 && i < userInputList.size())
		{
			if( userInputList.get(i).equals("A") || userInputList.get(i).equals("ABS") ){
				Fraction first = new Fraction(userInputList.get(i-1));
								
				result = first.absValue();
				result.simplify();
				for(int j = 0; j < 2; j++)
					userInputList.remove(i-1);
				userInputList.add(i -1, result.getNumerator() + "/" + result.getDenominator());
				i -= 1;
			}
			i++;
		}
		i = 0;
		while(userInputList.size() > 1 && i < userInputList.size())
		{
			if( userInputList.get(i).equals("N") || userInputList.get(i).equals("NEG") ){
				Fraction first = new Fraction(userInputList.get(i-1));
								
				result = first.negate();
				result.simplify();
				for(int j = 0; j < 2; j++)
					userInputList.remove(i-1);
				userInputList.add(i -1, result.getNumerator() + "/" + result.getDenominator());
				i -= 1;
			}
			i++;
		}
		i = 0;

		while(userInputList.size() > 1 && i < userInputList.size())
		{
			if( userInputList.get(i).equals("*") || userInputList.get(i).equals("/") ){
				Fraction first = new Fraction(userInputList.get(i-1));
				Fraction second = new Fraction(userInputList.get(i+1));
				
				
				result = userInputList.get(i).equals("*") ? first.multiply(second) : first.divide(second);
				result.simplify();
				for(int j = 0; j < 3; j++)
					userInputList.remove(i-1);
				userInputList.add(i -1, result.getNumerator() + "/" + result.getDenominator());
				i -= 1;
			}
			i++;
		}
		i = 0;
		while(userInputList.size() > 1 && i < userInputList.size()){
			if( userInputList.get(i).equals("+")|| userInputList.get(i).equals("-") ){
				Fraction first = new Fraction(userInputList.get(i-1));
				Fraction second = new Fraction(userInputList.get(i+1));
				
				
				result = userInputList.get(i).equals("+") ? first.addition(second) : first.subtract(second);
				result.simplify();
				for(int j = 0; j < 3; j++)
					userInputList.remove(i-1);
				userInputList.add(i -1, result.getNumerator() + "/" + result.getDenominator());
				i -= 1;
			}
			i++;
		}
		return result;
	}
	
	
	


	
}