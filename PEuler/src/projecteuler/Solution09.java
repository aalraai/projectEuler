package projecteuler;

public class Solution09 {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
	 * a^2 + b^2  c^2.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * @category Problem: Find the product "abc".
	 * 
	 * @Author Akram Alraai
	 */
	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		int s = 1000;
		boolean found = false;
		
		//use the fact that a < b < c. So a < s/3 and b < s/2
		for(a = 1; a < s/3; a ++){
			for(b = a; b < s/2; b++){
				c = s - b - a;
				if(a*a + b*b == c*c){
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		}
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println("Product of abc: "+ a*b*c);
		

	}

}
