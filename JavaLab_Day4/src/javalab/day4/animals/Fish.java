package javalab.day4.animals;

public class Fish {

	
	//Fish - bob, swim, eat
	
	 private String name;
	 private Integer age;
	 private boolean alive;
	 private Integer healthRating;
	  
	 
	 // constructor
	 public Fish(String _name, Integer _age,Integer _healthRating){
		name = _name; 
		healthRating = _healthRating; 
		age = _age;
		alive = true;
		
	 }
	 
	 public void bob(){
		System.out.println("Fish " + name + " is bobbing nicely"); 
		 
		 
	 }
	 
	 public void swim(){
			System.out.println("Fish " + name + " is swimming"); 
			 
			 
		 }
		 
	 public void eat(){
			System.out.println("Fish " + name + " is eating"); 
			 
			 
		 }
		
	 
		public void doStuff(){
			bob();
			swim();
			eat();
			System.out.println(getStatus());
		}

		 public String getStatus(){
				return "Fish " + name + " is " + age + " year(s) old and has health of " + healthRating;
				
				 		 
			 }
	
}
