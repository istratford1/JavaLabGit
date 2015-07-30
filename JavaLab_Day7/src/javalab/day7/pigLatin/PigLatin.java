package javalab.day7.pigLatin;

import java.io.*;


	// pig latin translator class
	public class PigLatin {
	    
	    
	    
	    // encode a word to a Pig Latin String
	    protected String encode(String word) {
	        String lcWord = word.toLowerCase();
	    	int vowelPos = getVowelPos(lcWord);
	        
	    	if (vowelPos == 0) {
	           // this means that the word starts with a vowel
	            return word + "yay";
	       
	        } else if (vowelPos == -1) {
	        	// this means that there is no vowel present in the word, so use the original word
	        	return word;
	        	
	        } else {
	            // there is a vowel present at position vowelPos
	        	// build new word  
	        	
	   
	        	
	        	String firstPart = word.substring(0, vowelPos); // first consonent  part of the word up to the vowelPos 
	            
	        	String secondPart = word.substring(vowelPos); // the word from the vowel pos to the end
	            
	        	return (secondPart + firstPart  + "ay");
	        }
	    }
	    
	  
	    // decode a Pig Latin String word
	    protected String decode(String word) {
	      	 int yayPos =  word.lastIndexOf("yay"); 
	    	 int ayPos =  word.lastIndexOf("ay"); 
		    	
	    	 if (yayPos >-1 ){
	    		// remove the yay.. 
	    		return word.substring(0,word.length()-3); 
	    	
	    	 } else if(ayPos > -1){
	    		 // remove the ay..
	    		 String newWord = word.substring(0,word.length()-2); 
	    		// get the last two  letters
	    	     String lastPart = "";
	    		 int lastCapitalPos =  getLastCapitalPos(newWord);
	    	     if (lastCapitalPos > -1){
	    	         lastPart = newWord.substring(lastCapitalPos, newWord.length());
	    	     }
	    	     
	    	     // put last letter back to the front of the word
	    		 return lastPart + newWord; 
	    		 
	    	 } else {
	    		 // no rules met, just return the original word..
	    		 return word;
	    		 
	    	 }
	    
	    }
	    
	    
	    // return the positon of the 1st  vowel
	    private int getVowelPos(String s) {
	        int vPos = -1;
	    	for (int i = 0; i < s.length(); i++) {
	            if (isVowel(s.charAt(i))) {
	                vPos = i;
	                break;
	           }
	        }
	        return vPos; // return -1 for no vowel
	    }

	    // return the positon of the 1st  vowel
	    private int getLastCapitalPos(String s) {
	        int vPos = -1;
	    	int sLength = s.length();
	        for (int i=sLength-1 ; i >-1; i--) {
	            if(Character.isUpperCase(s.charAt(i))) {
	      
	                vPos = i;
	                break;
	           }
	        }
	        return vPos; // return -1 for no vowel
	    }


		// is the character a vowel ??
	    private boolean isVowel(char c){
	    	switch (c){
	    	  case 'a':   case 'e':  case 'i':   case 'o':  case 'u':	    		  
	    		 return true; 
			default:		
	    		 return false; 
	    	
	    	}
	    }
	    
	    
	    
	    
	    protected String encodeLine(String line) {
	        // split line into separate words
	        String words[] = line.split("\\b");
	        String result = "";
	        for (int i = 0; i < words.length; i++) {
	            result = result + encode(words[i]);
	        }
	        return result;
	    }
	 

	    protected String decodeLine(String line) {
	        // split line into separate words
	        String words[] = line.split("\\b");
	        String result = "";
	        for (int i = 0; i < words.length; i++) {
	            result = result + decode(words[i]);
	        }
	        return result;
	    }
	 
	    
	    
	}


