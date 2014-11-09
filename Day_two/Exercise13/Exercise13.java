/******************************************************************************************************
* Day One: Exercise 13                                                                                *
*  All the primes up to 1,000 (*)                                                                     *
*                                                                                                     *
* Author: ttadde01                                                                                    *
*******************************************************************************************************/

public class Exercise13{

	public static void main(String args[]){
		boolean primeFound = false;
		String outPut = "";
		for(int j = 2; j < 1000; j++){
			if(isPrime(j)){
				outPut = outPut + j + "\n";
				primeFound = true;
			}
		}
		
		if(primeFound){
			System.out.println("The following prime numbers have been found");
			System.out.println(outPut);
		}
	}

	public static boolean	 isPrime(int num){
		boolean prime = true;
		for (int i = 2; i <= num / 2  && num !=  1; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		return prime;
	}

}