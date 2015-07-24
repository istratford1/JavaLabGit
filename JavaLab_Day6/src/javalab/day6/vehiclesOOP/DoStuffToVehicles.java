package javalab.day6.vehiclesOOP;

import java.util.*;



public class DoStuffToVehicles {

	
	public static void main(String[] args){
		

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// add some vehicles
		
		vehicles.add(new Bicycle("20/10/1921"));
		vehicles.add(new Car(4,true));
		vehicles.add(new Car("Blue","Ford","Focus",5002,67,"02/10/2010",5,false));
		vehicles.add(new SportsCar("Red","Pontiac","Firebird",25000,45,"30/03/2001",2,true, 6, 22));
		vehicles.add(new Boat("Silver", "Sealine","X100",230000,92,"01/03/2014",1,"Luxury Yacht",true,false,true));
		vehicles.add(new Bus("Silver", "Sealine","X100",230000,92,"01/03/2014",90,1,"Diesel"));
		
	
		for(Vehicle v : vehicles){
			System.out.println("-----------------------------");
			v.showStuff();
			
		}
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
			
}
