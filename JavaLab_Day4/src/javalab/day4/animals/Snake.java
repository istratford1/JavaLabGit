package javalab.day4.animals;

public class Snake {

	// Hiss, eat, shed skin
	
	 private String name;
	 private Integer age;
	 private boolean alive;
	 private Integer healthRating;
	  
	 
	 // constructor
	 public Snake(String _name, Integer _age,Integer _healthRating){
		name = _name; 
		healthRating = _healthRating; 
		age = _age;
		alive = true;
		
	 }
	 
	 public void hiss(){
		System.out.println("Snake " + name + " hisses: ssssssssss !"); 
		 
		 
	 }
	 
	 public void shedSkin(){
			System.out.println("Snake " + name + " sheds their skin "); 
			 
			 
		 }
		 
	 public void eat(){
			System.out.println("Snake " + name + " is eating"); 
			 
			 
		 }
		
	 
		public void doStuff(){
			hiss();
			shedSkin();
			eat();
			System.out.println(getStatus());
		}

		 public String getStatus(){
				return "Snake " + name + " is " + age + " year(s) old and has health of " + healthRating;
				
				 		 
			 }
	
}
