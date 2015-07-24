package javalab.day6.animalsOOP;

public class Snake extends Animal {

	
	
	public Snake(){
	    super();
		
	}
	
	public Snake(String name, Integer age, boolean alive, Integer healthRating) {
		super(name, age, alive, healthRating);
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
	
	
	@override
	public void doStuff(){
		super.doStuff();
		this.hiss();
		this.shed();
		
		
	}

	
	
	
	
}
