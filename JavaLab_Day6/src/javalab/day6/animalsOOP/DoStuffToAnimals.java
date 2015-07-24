package javalab.day6.animalsOOP;
import java.util.*;

public class DoStuffToAnimals {

	
	public static void main(String[] args){
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Snake("Sid", 10, true ,40));
		
		animals.add(new Snake("Sally",2)); // rand health
		
		animals.add(new Dog("Fido",7)); // rand health
		
		animals.add(new Fish("Goldie",20, true, 72));
		
		
		for(Animal a : animals){
			a.doStuff();
			
		}
		
		
		
		
	}
	
	

	
	

	

	
	
	
	
	
}
