package javalab.day12.XML_DOM;

public class Employee {

	private String name;
	private int empID;
	private String deptCode;
	private String startDate;
	private int salary;
	private double benefitDeduction;
	
	
	
	// default constructor
    public Employee(){
    	
    	
    }
    
	public String toString(){
		return name + " id " + empID + " salary £" + salary + " department" + deptCode;
		
	}
    
    
	public void setBenefitDeduction(double benefitDedIn) {
		benefitDeduction = benefitDedIn;
	}
	
	public double getBenefitDeduction() {
		return benefitDeduction;
	}
	
	public double findPaymentAmount() {
		return salary - benefitDeduction;
	}

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}


	




	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}




	



	
}
