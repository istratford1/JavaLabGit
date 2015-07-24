package javalab.day6.cyberpetOOP;

public class Animal extends Cyberpet {


	private String name;
	private Integer age;
	private boolean alive;




	public Animal(){
		alive = true;
	}

	public Animal(String name) {

		this();
		this.name = name;
		
	}

	public Animal(String name, Integer age) {
		this();	
		this.name = name;
		this.age = age;
		this.alive = true;
	
	}

	
	@Override
	public void doStuff(){
		super.doStuff();
		System.out.println("************ I am an aminal and I like doing this: *******************");
	
		
			
	}


	public void eat(){
		System.out.println(name + " is eating");

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



}
