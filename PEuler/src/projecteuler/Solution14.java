package projecteuler;

public class Solution14 {
	
	/**
	 *	
	 * @category Problem: The following iterative sequence is defined for the set of positive integers:
	 *									n -> n/2 (n is even)
	 *									n -> 3n + 1 (n is odd)
	 *					  Using the rule above and starting with 13, we generate the following sequence:
	 *								13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
	 *
	 *					   It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
	 * 					   Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 *
	 *					   Which starting number, under one million, produces the longest chain?
     *
	 *					   NOTE: Once the chain starts the terms are allowed to go above one million.
	 *
	 * @author Akram Alraai
	 */
	

	public static void main(String[] args){
		
		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		int nmbr = 1000000;
		
		long seqLen = 0;
		long startNmbr = 0;
		long seq = 0;
		
		for(int i = 2; i <= nmbr; i++){
			int length = 1;
			seq = i;
			while(seq != 1){
				if(seq % 2 == 0){
					seq = seq/2;
				}else{
					seq = 3*seq + 1;
				}
				length++;
			}
			
			if(length > seqLen){
				seqLen = length;
				startNmbr = i;
			}	
		}

		System.out.println(seqLen + " und " + startNmbr);
		
		
		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");
		
	}

}
