package projecteuler;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Solution13 {

	private static BufferedReader br;

	/**
	 *	
	 * @category Problem: Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	 * 
	 * @author Akram Alraai
	 */
	

	public static void main(String[] args) throws IOException {

		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		String p = "sol13.txt";
		String line;
		double result = 0;
		FileReader fr = new FileReader(p);
		br = new BufferedReader(fr);
		
		while((line = br.readLine()) != null){
			result += Double.parseDouble(line);
		}
		
		System.out.println(result);
		
		
		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");

	}

}
