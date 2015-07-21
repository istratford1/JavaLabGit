package javalab.day4;

public class Dog {

	
	// Dog - Bark, walk, eat, sleep, play (name, age, alive/dead, health)
	
		
	
	
	
	 private String name;
	 private Integer age;
	 private boolean alive;
	 private AnimalHealth healthRating;
	
	 // constructor
	 public Dog(String dogname){
		name = dogname; 
		health = new AnimalHealth();  
	 }
	 
	 
	 public void play(){
		 if (alive){
			 System.out.println("Dog " + name + " is playing !");
		 } else {
			 
			System.out.println("Dog " + name + " can't play - he's dead");
			 
		 }
		 
	 }
	 
	 public void walk(){
		
		 System.out.println("Dog " + name + " is walking");
		 
	 }
	 
	 public void sleep (){
			
		 System.out.println("zzzzzz " + name + " is sleeping");
		 
	 }
	 
	 public void bark (){
			
		 System.out.println("Woof!" );
		 
	 }
	 
	 public void eat (){
			
		 System.out.println("Dog " + name + " is eating");
		 if (healthRating < 7 ) {
			 healthRating ++;
			 
		 }
		 
	 }
	 
	 
	 
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Integer getHealthRating() {
		return healthRating;
	}
	public void setHealthRating(Integer healthRating) {
		this.healthRating = healthRating;
	}
	 
		
		
	 
		
		
	}
	
	
	

