package javalab.day6.animalsOOP;

public class Animal {


	private String name;
	private Integer age;
	private boolean alive;
	private Integer healthRating;



	public Animal(){

	}

	public Animal(String name, Integer age, boolean alive, Integer healthRating) {
		super();
		this.name = name;
		this.age = age;
		this.alive = alive;
		this.healthRating = healthRating;
	}

	public Animal(String name, Integer age) {

		this.name = name;
		this.age = age;
		this.alive = true;
		this.healthRating = getRandomHealthRating();
	}

	
	public void doStuff(){
		System.out.println("**********************************");
		System.out.println(name + " has a health rating of " + healthRating);
		System.out.println("After we eat, lets do some stuff !");
		eat();
			
	}


	public void eat(){
		System.out.println(name + " is eating");

	}

	private int getRandomHealthRating(){
		return randomValue(1,80);


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

	
	 /// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}
	 
}
