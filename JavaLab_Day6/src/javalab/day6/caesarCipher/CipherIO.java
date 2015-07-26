package javalab.day6.caesarCipher;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CipherIO extends Cipher{

	
	
	public CipherIO(int keyNum) {
		super(keyNum);
		// TODO Auto-generated constructor stub
	}

	// isValidString
		// checks each character in the string to ensure that it is in the expected range
		boolean isValidString(String str){
			boolean badFound = false;
			for(int i=0; i < str.length(); i++){
				int charNum = (int) str.charAt(i);
				if (! super.isValidCharNum(charNum)){
					badFound = true;
					break;
					
				}
			}
			
		 return !badFound;	
		}
		
		/// encode the string according to the cipher key
		// INPUT: str - the string to be encoded
		// 		  key - the cipher to be used 
		public String encode(String str){
			
			String eStr = "";
			String badChars = "";
			int chaNum = 0;
			/// for loop around the string
			for(int i=0; i<str.length(); i++){
				chaNum =  (int) str.charAt(i); // get the existing char number
				char newChar = (char) (int) encodeCharNum(chaNum);
				eStr = eStr + Character.toString(newChar);
							
			}
			
		
			if (badChars.length() ==0) {
	    	   return eStr;
			}else{
			   return "";
			}
				
		}
		
		/// decode the string according to the cipher key
		// INPUT: str - the string to be encoded
		// 		  key - the cipher to be used 
		public String decode(String str){
			
			String eStr = "";
			String badChars = "";
			int chaNum = 0;
			/// for loop around the string
			for(int i=0; i<str.length(); i++){
				chaNum =  (int) str.charAt(i); // get the existing char number
				char newChar = (char) (int) decodeCharNum(chaNum);
				eStr = eStr + Character.toString(newChar);
							
			}
			
		
			if (badChars.length() ==0) {
	    	   return eStr;
			}else{
			   return "";
			}
		}
		
		
		/// encode the file according to the cipher key
		// INPUT: file - the file to be encoded
		// this implementation automatocaly creates a new file with the prefix _ENCODED
		// in the same directory as the starting file
		public File encode(File sourcefile) throws IOException{
			
			 FileReader inputStream = null;
		     FileWriter outputStream = null;
		     File encodedFile = new File("ENCODED_" + sourcefile.getName());
		     if (!encodedFile.exists()) encodedFile.createNewFile();
		     	
		        try {
		            inputStream = new FileReader(sourcefile);
		            outputStream = new FileWriter(encodedFile);

		            int c;
		            while ((c = inputStream.read()) != -1) {
		                //outputStream.write(c);
		                outputStream.write(encodeCharNum(c));
		                
		            }
		            
		        } finally {
		            if (inputStream != null) {
		                inputStream.close();
		            }
		            if (outputStream != null) {
		                outputStream.close();
		            }
		        }
			
		      
		        return encodedFile;
				
		}

		/// decode the file according to the cipher key
		// INPUT: file - the file to be decoded
		// this implementation automatocaly creates a new file with the prefix _decoded
		// in the same directory as the starting file
		public File decode(File sourcefile) throws IOException{
			
			 FileReader inputStream = null;
		     FileWriter outputStream = null;
		     File decodedFile = new File("DECODED_" + sourcefile.getName());
		     if (!decodedFile.exists()) decodedFile.createNewFile();
		     	
		        try {
		            inputStream = new FileReader(sourcefile);
		            outputStream = new FileWriter(decodedFile);

		            int c;
		            while ((c = inputStream.read()) != -1) {
		                //outputStream.write(c);
		                outputStream.write(decodeCharNum(c));
		                
		            }
		            
		        } finally {
		            if (inputStream != null) {
		                inputStream.close();
		            }
		            if (outputStream != null) {
		                outputStream.close();
		            }
		        }
			
		      
		        return decodedFile;
				
		}

		


}
