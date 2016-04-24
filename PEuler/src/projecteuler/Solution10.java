package projecteuler;
import java.util.ArrayList;


public class Solution10 {

	/**
	 * @category Problem: Find the sum of all the primes below two million.
	 * @author Akram Alraai
	 */
	//Sieb des Eratosthenes
	
	public static ArrayList<Boolean> aussieben(double zahl) {

		// Legt eine neue Liste an
		ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();
		
		// F�llt die neue Liste mit lauter true-Elementen
		for (int i = 0; i <= zahl; i++) {
			zahlenListe.add(i, true);
		}

		for (int i = 2; i <= zahl; i++) {

			if (zahlenListe.get(i) == true) {
				int j = i;
				do {
					j = j + i;
					if (j <= zahl) {
						// Ist die Zahl ein Vielfaches einer 
						// Primzahl, dann wird sie mit false 
						// markiert
						zahlenListe.set(j, false);
					}
				} while (j <= zahl);
			}
		}
		return zahlenListe;
	}

	
	
	public static void main(String[] args) {

		long zstVorher;
		long zstNachher;
		
		zstVorher = System.nanoTime();
		
		long zahl = 2000000;
		long tmp = 0;
		
		zahl++;
		ArrayList<Boolean> loesungListe = aussieben(zahl);

		System.out.println("Primzahlen sind: ");
		for (int i = 0; i <= zahl - 1; i++) {
			if (loesungListe.get(i) == true && i > 1) {
				tmp += i;
			}
		}
		
		System.out.println(tmp);
	

		zstNachher = System.nanoTime();
		System.out.println("Zeit ben�tigt: " + ((zstNachher - zstVorher)/1000000) + " ms");

	}	
}
