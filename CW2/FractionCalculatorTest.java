/****************************************************************************************************************************
* CW2 FractionCalculator Class                                                                                              *
* Written by Tadiwos Taddese                                                                                                *
* Author: ttadde01                                                                                                          *
****************************************************************************************************************************/
public class FractionCalculatorTest{

	public static void main(String args[]){	
		FractionCalculator calc = new FractionCalculator();
		String menuSelected;
		boolean isLive = true;

		while (true){
			menuSelected = calc.mainMenu().toUpperCase();
			if (menuSelected.equals("1")){
				while (isLive){
					menuSelected = calc.singleCommandMenu().toUpperCase();
					//menuSelected = calc.validateUserInput(menuSelected);
					switch (menuSelected){
						case "":
							break;
						case "*":
						case "/":
						case "+":
						case "-":
							calc.operator = menuSelected;
							break;
						case "A":
						case "ABS":
						case "N":
						case "NEG":
							calc.setResultFraction(calc.evaluateFunction(menuSelected));
							System.out.println(calc.resultFraction);
							break;
						case "C":
						case "CLEAR":
							calc.clearCalculator();
							break;
						case "Q":
						case "QUIT":
							System.out.println("\n\nExiting Single command mode!");
							calc.clearCalculator();
							isLive = false;
							break;
						default:
							calc.setResultFraction(calc.evaluate(calc.getResultFraction(), menuSelected));
							System.out.println(calc.resultFraction);
							break;
					}
				}
				isLive = true;
			}
			else if (menuSelected.equals("2")){
				while (isLive){
					menuSelected = calc.multipleCommandMenu().toUpperCase();
					//menuSelected = calc.validateUserInput(menuSelected);
					if(menuSelected.equals("Q") || menuSelected.equals("QUIT")){
						System.out.println("\n\nExiting Multiple command mode!");
						calc.clearCalculator();
						isLive = false;
					}
					else if(menuSelected.equals("")){
						isLive = false;
					}
					else{
						calc.setResultFraction(calc.evaluateMultiple(menuSelected));
						System.out.println(calc.resultFraction);
					}
				}
				isLive = true;
			}
			else if (menuSelected.equals("Q") || menuSelected.equals("QUIT")){
				System.out.println("\n\nThanks for using the command line calculator!");
				System.exit(0);
			}
			else{
				System.out.println("\nYou have entered an invalid input, please try again!");
			}
		}
	}
}