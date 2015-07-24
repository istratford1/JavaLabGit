package javalab.day6.animalsOOP;

public class Fish extends Animal {

	public Fish(){
	    super();
		
	}
	
	public Fish(String name, Integer age, boolean alive, Integer healthRating) {
		super(name, age, alive, healthRating);
	}
	
	public Fish(String name, int age){
		super(name,age);
		
		
	}
	
	public void bob() {
		System.out.println("Bobbing");
		
		
	}
	
	
	public void swim(){
		System.out.println("Swimiming");
		
	}
	
	
	@Override
	public void doStuff(){
		super.doStuff();
		this.bob();
		this.swim();
		
		
	}
	
}
