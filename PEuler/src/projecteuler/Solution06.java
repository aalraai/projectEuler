package projecteuler;

public class Solution06 {
	/**
	 * The sum of the squares of the first ten natural numbers is
	 * 1^2 + ... + 10^2 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + ... + 10)^2 = 3025
	 * 
	 * Difference 3025 - 385 = 2640
	 * 
	 * @category Problem: Find the difference between the sum of the squares of the first one
	 * 			 hundred natural numbers and the square of the sum.
	 * 
	 * @Author Akram Alraai
	 */
	
	public static void main(String[] args){
		
		int n = 100;
		
		long k =  (n * (n + 1) * (2*n + 1))/6; //Summenformel von sum_{1 to n} k^2 
		long l = (n * (n + 1))/2	;		   //Summenformel von (sum_{1 to n} k)^2
		
		long result = l*l - k;
		System.out.println("k: " + k + " l^2: " + l*l);
		System.out.println(result);
		
		
	}
}
