public class Exercise2{

	public static void main(String args[]){
		Calculator calc = new Calculator();
		String userInput;
		UserConsoleInputUtility util = new UserConsoleInputUtility();
		
		userInput = util.readLineFromConsole("Write your text representing a mathematical operation in the format 2 * 3. \nUsing a single operator in: +, -, *, or /.");
		
		System.out.println(userInput.split('*'));
	}
}