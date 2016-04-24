package projecteuler;


public class Solution16 {

	/**
	 * @category 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 *			 What is the sum of the digits of the number 21000?
	 */
	
	public static long binom(int n, int k){
		long erg = 0;
		if(k == 0){
			return 1;
		}
		if(2*k > n){
			erg =  binom(n, n - k);
		} else{
			erg = n-k+1;
			for(int i = 2; i <= k; i++){
				erg *= n - k + i;
				erg /= i;
			}
			
		}
		
		return erg;
	}
	
	public static void main(String[] args) {
		
		long zstVorher;
		long zstNachher;
		
		int n = 1000;
		int erg1 = 0;
		
		zstVorher = System.nanoTime();
		

		
		for(int k = 0; k <= n; k++){
			erg1 += binom(n,k);
		}
		
		System.out.println(erg1);
		//Aufsplitten und man erh�lt 1366
		
		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");

	}

}
