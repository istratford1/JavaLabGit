package javalab.day6.caesarCipher;


public class Cipher{
		
		
	private int keyNum;

	public Cipher(){}

	
	public Cipher(int keyNum) {
		super();
		this.keyNum = keyNum;
	}
	
	

	// isValidChar
	// returns true if the character is in the valid range
	protected boolean isValidCharNum(int chaNum){
		
		if (isBetween(chaNum,65,90)){
			/// lowercase
			return true;
		} else if (isBetween(chaNum,97,122)){
			// uppercase
			return true;
		} else if (chaNum == 32){
			// space
			return true;
		} else {
			return false;
		}
		
	}
	
	// encodeCharNum
	// returns encoded character number according  to key provided
	protected Integer encodeCharNum(int chaNum){
		
		
		if (isBetween(chaNum,65,90)){
			/// Upper case
			int underOffset = 65 - (chaNum - keyNum) ;
			if(underOffset > 0){
				// would be below character set , so needs to be offset to new char
				return (90-underOffset);
			}else{
				return (chaNum - keyNum);
			}
			
		
		} else if (isBetween(chaNum,97,122)){
			// lowercase
			int underOffset = 97 - (chaNum - keyNum) ;
			if(underOffset > 0){
				// would be below character set , so needs to be offset to new char
				return (122-underOffset);
			}else{
				return (chaNum - keyNum);
			}
			
			
		} else if (chaNum == 32){
			// space
			return chaNum;
			
		} else {
			return chaNum;
			
		}
		
	}
	
	// decodeCharNum
		// returns decoded character number according  to key provided
	protected Integer decodeCharNum(int chaNum){
			
			int overOffset;
			
			/// upperCase
			if (isBetween(chaNum,65,90)){
				overOffset = 90 - (chaNum + keyNum) ; // work out the offset
				if(overOffset <= 0){
					// would be above character set , so needs to be offset to char lower in the charset
					return (65 + -(overOffset));
				}else{
					return (chaNum + keyNum);
				}
				
								
			} else if (isBetween(chaNum,97,122)){
				// lowerCase
				overOffset = 122  - (chaNum + keyNum)  ; // test for values that would fall below characterset
				if(overOffset <= 0){
					// would be above character set , so needs to be offset by the number of characters over
					return (97 + -(overOffset));
				}else{
					return (chaNum + keyNum);
				}
				
				
			} else if (chaNum == 32){
				// space
				return chaNum;
				
			} else {
				return chaNum;
				
			}
			
		}
	
		
		
	/// isBetween
	// works out if an integer falls between two set values
	protected boolean isBetween(int x, int lower, int upper) {
		  return lower <= x && x <= upper;
		}
	


	
	
	
	

}
