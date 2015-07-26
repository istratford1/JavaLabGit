package javalab.day6.caesarCipher;


import java.io.File;
import java.io.IOException;

public class DoSomthingWithCipher {

	
	
	public static void main(String[] args) throws IOException{
		
		// usage as string
		
		CipherIO s = new CipherIO(6); // set the key
		String encodedString = s.encode("This Sentence to encode"); // accepts String
		String decodedString = s.decode(encodedString); // accepts String
		
		System.out.println("Decoded String: " + decodedString);
		

		// usage as file
		
		String testFilePath = System.getProperty("user.dir") + "\\textExample.txt";
		
		CipherIO f = new CipherIO(22); // set the key
		File encodedFile = f.encode(new File(testFilePath)); // accepts file object
	    File decodedFile = f.decode(encodedFile); // accepts file object

	 	System.out.println("Decoded File created in: " + decodedFile.getAbsolutePath());
		
		
		
		
	}
	
}
