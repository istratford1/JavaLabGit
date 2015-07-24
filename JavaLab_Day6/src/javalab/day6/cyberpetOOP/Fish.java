package javalab.day6.cyberpetOOP;

public class Fish extends Animal {

	public Fish(){
	    super();
		
	}
	

	public Fish(String name){
		super(name);
		
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
