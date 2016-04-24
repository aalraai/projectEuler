package projecteuler;

public class Solution15 {

	/**
	 * @category How many such routes are there through a 20�20 grid?
	 * @author Akram Alraai
	 */
	public static void main(String[] args) {
		
		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		int grid = 20;
		long path = 1;
		
		for(int i = 0; i < grid; i++){
			path *= (2*grid) - i;
			path /= i + 1;
		}
		
		System.out.println(path);
	
		
		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");
		
		
	}

}
