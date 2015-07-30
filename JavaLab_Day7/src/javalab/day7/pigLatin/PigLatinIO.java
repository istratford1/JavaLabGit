package javalab.day7.pigLatin;
import java.io.*;
public class PigLatinIO extends PigLatin {

	
	
	
	public PigLatinIO() {
		// TODO Auto-generated constructor stub
	}

		
   
        
  		// overload without providing an encoded filename
	    public File encode(File sourcefile) throws IOException{
	    	
	    	
	    	///  automatically genetrate encoded filename
	    			
  			  
	    	String encodedFileName = "ENCODED_" + sourcefile.getName();
  			return encode(sourcefile,encodedFileName);
  		
  		}

        /// encode the file according to piglatin rules
  		// INPUT: file - the file to be encoded also a ref to the encoded file

  		public  File encode(File sourcefile, String encodedFileName) throws IOException{
  			
  		 	 BufferedReader bReader = null;
  			 BufferedWriter bWriter = null;
  			 
  			 File encodedFile = new File(sourcefile.getParent() + "\\" + encodedFileName);
  			 
  		     if (!encodedFile.exists()) encodedFile.createNewFile();
  		       if(!sourcefile.exists()) {
  		    	   throw new IOException("Can't find the file" );
  		       }
  		     
  		        try {
  		            bReader = new BufferedReader(new FileReader(sourcefile));
  		            bWriter = new BufferedWriter(new FileWriter(encodedFile));

  		            String line = bReader.readLine();
  		            while (line != null) {
  		               // encode the newly read line from source
  		               String encodedLine = encodeLine(line);
  		               // write the line to the encoded file 
  		               bWriter.write(encodedLine); 
  		               // read next line from source
  		               line = bReader.readLine();
  		               bWriter.newLine(); 
		                 		            
		               
  		            }
  		            
  		         
  		          bWriter.flush();
  		          
  		          return encodedFile;
		          
  		            
  		        } finally {
  		            if (bReader != null) {
  		                bReader.close();
  		            }
  		            if (bWriter != null) {
  		                bWriter.close();
  		            }
  		       
  		          
  		        }
  			
  			
  		
  				
  		}
  		
  		
        
  	// overload without providing an decoded filename
	    public File decode(File encodedfile) throws IOException{
	    	
	    	
	    	///  automatically genetrate decoded filename
	    			
  			  
	    	String decodedFileName = "DECODED_" + encodedfile.getName();
  			return decode(encodedfile,decodedFileName);
  		
  		}

        /// decode the file according to piglatin rules
  		// INPUT: file - the file to be decoded also a ref to the decoded file

  		public  File decode(File sourcefile, String decodedFileName) throws IOException{
  			
  		 	 BufferedReader bReader = null;
  			 BufferedWriter bWriter = null;
  			 
  			 File decodedFile = new File(sourcefile.getParent() + "\\" + decodedFileName);
  			 
  		     if (!decodedFile.exists()) decodedFile.createNewFile();
  		       if(!sourcefile.exists()) {
  		    	   throw new IOException("Can't find the file" );
  		       }
  		     
  		        try {
  		            bReader = new BufferedReader(new FileReader(sourcefile));
  		            bWriter = new BufferedWriter(new FileWriter(decodedFile));

  		            String line = bReader.readLine();
  		            while (line != null) {
  		               // decode the newly read line from source
  		               String decodedLine = decodeLine(line);
  		               // write the line to the decoded file 
  		               bWriter.write(decodedLine); 
  		               // read next line from source
  		               line = bReader.readLine();
  		               bWriter.newLine(); 
		                 		            
		               
  		            }
  		            
  		         
  		          bWriter.flush();
  		          
  		          return decodedFile;
		          
  		            
  		        } finally {
  		            if (bReader != null) {
  		                bReader.close();
  		            }
  		            if (bWriter != null) {
  		                bWriter.close();
  		            }
  		       
  		          
  		        }
  			
  			
  		
  				
  		}
  		
    
}
