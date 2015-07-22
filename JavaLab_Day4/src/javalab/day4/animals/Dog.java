package javalab.day4.animals;

// Dog - Bark, walk, eat, sleep, play (name, age, alive/dead, health)
// Dog class 

public class Dog {

	

	
	 private String name;
	 private Integer age;
	 private boolean alive;
	 private Integer healthRating;
	
	
	 // constructor
	 public Dog(String _name, Integer _age,Integer _healthRating){
		name = _name; 
		healthRating = _healthRating; 
		age = _age;
		alive = true;
		
	 }
	 
	public void doStuff(){
		bark();
		walk();
		eat();
		sleep();
		play();
		System.out.println(getStatus());
	}
	 	 
	 public void bark (){
			
		 System.out.println("Woof!" );
		 
	 }
	
	 public void walk(){
			
		 System.out.println("Dog " + name + " is walking");
		 
	 }
	 
	 public void eat (){
			
		 System.out.println("Dog " + name + " is eating");
		
		 }
		 
	 
	 public void sleep (){
			
		 System.out.println("zzzzzz " + name + " is leeping");
		 
	 }
	 
	 
	 public void play(){
		 if (alive){
			 System.out.println("Dog " + name + " is playing !");
		 } else {
			 
			System.out.println("Dog " + name + " can't play - he's dead");
			 
		 }
		 
	 }
	 
	 
	 public String getStatus(){
		return "Dog " + name + " is " + age + " year(s) old and has health of " + healthRating;
		
		 		 
	 }
	 
	 	 
}

	
	

