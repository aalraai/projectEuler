package projecteuler;

public class Solution01 {
	
	/**
	 * @author Akram Alraai
	 * @category Problem: Find the sum of all the multiplies of 3 or 5 below 1000.
	 */
	
	public static void main(String[] args){
		
		int tmp = 0;
		
		for(int i = 1; i < 1000; i++){
			if(i%3==0 || i%5==0){		// % = ggT(i,3)
				tmp += i;
			}
			
		}
		System.out.println(tmp);
	}

}
