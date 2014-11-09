/******************************************************************************************************
* Day One: Exercise 14                                                                                *
*  Modify the program that you wrote for the former exercise so that it writes on screen the first    *
*  1,000 primes.                                                                                      *
*                                                                                                     *
* Author: ttadde01                                                                                    *
*******************************************************************************************************/

public class Exercise14{

	public static void main(String args[]){
		boolean primeFound = false;
		String outPut = "";
		for(int j = 2, count = 0; count <= 1000; j++){
			if(isPrime(j)){
				outPut = outPut + j + "\n";
				count++;
				primeFound = true;
			}
		}
		
		if(primeFound){
			System.out.println("The following prime numbers have been found");
			System.out.println(outPut);
		}
	}

	public static boolean isPrime(int num){
		boolean prime = true;
		for (int i = 2; i <= num / 2  && num !=  1; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		return prime;
	}

}