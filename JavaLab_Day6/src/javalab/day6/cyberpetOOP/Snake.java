package javalab.day6.cyberpetOOP;

public class Snake extends Animal {

	
	
	public Snake(){
	    super();
		
	}
	

	
	public Snake(String name) {
		super(name);
		
	}



	public Snake(String name, int age){
		super(name,age);
		
		
	}
	
	public void shed() {
		System.out.println("Shed Skin");
		
		
	}
	
	
	public void hiss(){
		System.out.println("Hiss");
		
	}
	
	
	@Override
	public void doStuff(){
		super.doStuff();
		this.hiss();
		this.shed();
		
		
	}

	
	
	
	
}
