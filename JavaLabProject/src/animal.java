import javax.swing.text.StyledEditorKit.ForegroundAction;

public class animal {

	int weight;
	int height;
	String name;
	String nickname;
	
	// constuctors
	public animal(){
	   name = "no name";
		
	}
	
	 ////overload1
	public animal(String name){
		setName(name);
	}
	
	
	//// overload2
	public animal(String name, String nickName){
		setName(name);
		setNickname(nickname);
		
	}
	
	
	// Methods
		
	public void setNickname(String _nickname) {
		nickname = _nickname;
		
	}

	public void setName(String animalName){
		name = animalName;
		
		
	}
	
	public String GetName(){
		return name;
		
		
	}
	
	public void move(int distance){
		System.out.print(name + " has moved " + distance + " Meters");
				
	}
	// Reverse name reverses the name 
	// convert the name into a charArray
	// loop backwards in the char array and add to a new str called revStr
	
	public String ReverseName(){
		
		String revStr = "";
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length -1; i > -1; i--) {
			revStr = revStr + String.valueOf( charArray[i]);
		}
		
	return revStr; 
			
	}
	
	
	// 
	public void changename(){
		
		
			
		
	}
	
}
