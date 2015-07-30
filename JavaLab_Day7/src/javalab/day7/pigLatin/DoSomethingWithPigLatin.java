package javalab.day7.pigLatin;

import java.io.File;
import java.io.IOException;


public class DoSomethingWithPigLatin {


	
	public static void main(String[] args) throws IOException{
		
		// usage as string
		
				PigLatinIO s = new PigLatinIO(); // set the key
				String original = "Please encode this Pig Latin String";
				
				String encodedString = s.encodeLine(original); // accepts String

				System.out.println("OriginalString: " + original);
				
				System.out.println("encoded String: " + encodedString);
				
				String decodedString = s.decodeLine(encodedString); // accepts String
				
				System.out.println("Decoded String: " + decodedString);
				

				// usage as file
				
				// test file should be in current workspace
		/*		String testFileDir = System.getProperty("user.dir"); 
				File sourceFile = new File(testFileDir + "\\" + "textExampleShort.txt");
				
				
				PigLatinIO f = new PigLatinIO(); // create piglatinIO
				File encodedFile = f.encode(sourceFile); // accepts file object, creates encoded file
			    File decodedFile = f.decode(encodedFile); // accepts file object

			 	System.out.println("Decoded File created in: " + decodedFile.getAbsolutePath());
				*/
		
		
	}

}
