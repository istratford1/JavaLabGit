package dummiesExercise.chapter8.employees;

public class Employee {

	private String name;
	private int empID;
	private String deptCode;
	private String startDate;
	private double weeklySalary;
	private double benefitDeduction;
	
	// default constructor
    public Employee(){
    	
    	
    }
    
   
	
	
	public void setWeeklySalary(double weeklySalaryIn) {
		weeklySalary = weeklySalaryIn;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setBenefitDeduction(double benefitDedIn) {
		benefitDeduction = benefitDedIn;
	}
	
	public double getBenefitDeduction() {
		return benefitDeduction;
	}
	
	public double findPaymentAmount() {
		return weeklySalary - benefitDeduction;
	}

	public String getName() {
		return name;
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
