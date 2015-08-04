package javalab.day11.JUnitTesting;

public class Company {

	String name;
	int numEmployees;
	
	
	
	
	public Company(String name, int numEmployees) {
		super();
		this.name = name;
		this.numEmployees = numEmployees;
	}


	public void hire(int n){
		numEmployees =+ n;
	}
	
	
	public void aquire(Company c){
		
		
	}

	@Override
	public boolean equals(Object obj){
		boolean equal = false;
		if (obj instanceof Company){
			Company c = (Company) obj;
			if(c.name.equals( this.name) &&  c.numEmployees == this.numEmployees){
				equal = true;
				
			}
			
		}
		return equal;
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumEmployees() {
		return numEmployees;
	}


	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	
	
	
	
	
}
