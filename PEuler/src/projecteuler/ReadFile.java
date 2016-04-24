package projecteuler;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
				
		//The name of the file to open. 
		String fileName = "sol13.txt";
		
		// This will reference one line at a time.
		String line = null;
		
		BufferedReader bufferedReader = null;
		
		try{
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);
			
			// Always wrap FileReader in BufferedReader.
			bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}					
			
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + fileName +"'");
		}catch(IOException ex){
			System.out.println("Error reading file '" + fileName + "'");
		}finally{
			//Always close files
			try{
				if(bufferedReader != null){
					bufferedReader.close();
				}
			}catch(IOException e){
				
			}
		}

	}

}
