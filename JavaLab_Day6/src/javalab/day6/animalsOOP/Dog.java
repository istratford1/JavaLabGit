package javalab.day6.animalsOOP;

public class Dog extends Animal{

	public Dog(){
	    super();
		
	}
	
	
	
	public Dog(String name, Integer age, boolean alive, Integer healthRating) {
		super(name, age, alive, healthRating);
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
	
	@override
	public void doStuff(){
		super.doStuff();
		this.bark();
		this.walk();
		this.sleep();
		this.play();
		
		
	}
}
