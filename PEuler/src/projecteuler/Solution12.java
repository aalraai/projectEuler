package projecteuler;

public class Solution12 {

	/**
	 * @category Problem: What is the value of the first triangle number to have over five hundred divisors?
	 * 
	 * @author Akram Alraai
	 */
	
		
	private static int NofD(int nmbr){
		int nod = 0;
		int sqrt = (int) Math.sqrt(nmbr);
		
		for(int i = 1; i <= sqrt; i++){
			if(nmbr % i == 0){
				nod += 2;
			}
		}
		
		//Correction if the number is a perfect number (quadratzahl)
		if(sqrt * sqrt == nmbr){
			nod--;
		}
		
		return nod;
	}
	
	public static void main(String[] args) {
	
		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		int nmbr = 0;
		int i = 1;
		
		while(NofD(nmbr) < 500){
			nmbr += i;
			i++;
		}
		
		System.out.println("Die erste Dreieckszahl mit �ber 500 Teiler ist: " + nmbr);

		
		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");

	}
}

