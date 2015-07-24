package javalab.day6.cyberpetOOP;



public class Dog extends Animal{

	public Dog(){
	    super();
		
	}
	
	
	
	public Dog(String name) {
		super(name);
	}
	
	public Dog(String name, int age){
		super(name,age);
		
		
	}
	
	public void bark() {
		System.out.println("WOOF");
		
		
	}

	public void walk() {
		System.out.println("walkies !");
		
		
	}
	
	
	public void sleep(){
		System.out.println("Sleeping");
		
	}
	
	public void play(){
		System.out.println("Playing");
		
	}
	
	@Override
	public void doStuff(){
		super.doStuff();
		this.bark();
		this.walk();
		this.sleep();
		this.play();
		
		
	}
}
