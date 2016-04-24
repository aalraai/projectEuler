package projecteuler;

public class Solution02 {
	
	/**
	 * 
	 * @category Problem: By considering the terms in the Fibonacci sequence whose values do not 
	 * 					  exceed four million, find the sum of the even-valued terms.
	 * @Author Akram Alraai
	 */
	
	
	//recursive Fibonacci
	public static long Fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	public static void main(String[] args){
		// f_33 = 3,524,578 < 4,000,000	
		
		//int n = new java.util.Scanner(System.in).nextInt();
		long tmp = 0;
		int i = 33;
		
		do{
			if(Fibonacci(i)%2==0){ //try ggT(fib(i),2) to get the even numbers of Fibonacci
				tmp += Fibonacci(i); //the sum of the even-valued terms
			}
			i--;
		}while(i > 0);
		
		System.out.println(tmp);	
	}





}
