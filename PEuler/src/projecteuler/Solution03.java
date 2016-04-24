package projecteuler;
//Primfaktorzerlegung

public class Solution03 {
	
	private static java.util.Scanner scanner;


	/**
	 * @category Problem: What is the largest prime factor of the number 600851475143?
	 * @Author Akram Alraai
	 * 
	 */

	public static boolean isPrime(long n){
		if(n == 2){
			return true;
		}
		else{
			for(int j=2; j*j <= n; j++){
				if(n%j == 0)
					return false;
			}
		}	
		return true;	
	}
	
	/*
	 * Eine nat�rliche Zahl wird in Primfaktoren zerlegt. 
	 * Abbruchbed. ist erf�llt, wenn n/i ein Primfaktor ist.
	 */
	public static void pFactor(long n){
		
		int i = 2;
			
		if(!isPrime(n)){
			while(i*i <= n){
				if(n%i==0){
					System.out.println(i + " &");
					pFactor(n/i);
				}
				i++;
			}
		}else{
			System.out.printf("%d ist/sind Primzahlen! ", n);
			System.exit(1);
		}
	}
	
	
	public static void main(String[] args){
		
		System.out.println("Geben Sie eine Zahl ein!");
		scanner = new java.util.Scanner(System.in);
		long nmbr = scanner.nextLong();
		
		pFactor(nmbr);
	}

}
