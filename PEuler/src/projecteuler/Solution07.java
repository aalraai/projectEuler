package projecteuler;



public class Solution07 {

	/**
	 * By listing the first six numbers: 2, 3, 5, 7, 11 and 13, we can see that the 6th
	 * prime is 13.
	 * 
	 * @category Problem: What is the 10001 st prime number?
	 * 
	 * @Author Akram Alraai
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
	
	
	public static void main(String[] args) {

		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		int n = 10001;
		int j = 2;
		int array[] = new int[n];
		
		/**
		 * Falls j eine Primzahl, so schreibe jenes in die Liste.
		 */
		
		for(int i = 0; i < n; i++){
			if(isPrime(j))
				array[i]=j;
			else
				i--;
		j++;
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i+1 +".Primzahl = " + array[i]);
		}
	

		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");
		
		//java.util.Arrays.fill(array, Boolean.FALSE);  // Oder import java.util.* und dann Arrays...

	}
}
