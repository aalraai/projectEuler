package projecteuler;

public class Solution04 {

	/**
	 * @category Problem: Find the Largest Palindrome product of two 3-digit numbers.
	 * @author Akram Alraai
	 */
	
	public static boolean isPalindrome(int n){
		
		int original = n;
		int reverse = 0;
		
		for(int i = 0; i <= n; i++){
			int digit = n % 10;
			n = n / 10;
			reverse = (reverse * 10) + digit;
		}

		return reverse == original;
	}
	
	
	
	public static void main(String[] args) {
	
		int largest = 0;
		int a = 0, b = 0;
		
		for(int i = 999; i > 0; i--){
			for(int j = 999; j > 0; j--){
				if(isPalindrome(i*j)){
					if((i*j)>largest){
						a = i;
						b = j;
						largest = i*j;
					}
				}	
			}
		}
		
		System.out.println("largest Palindrome: " +a +"*"+b+" = " + largest);
	}

}
