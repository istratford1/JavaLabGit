package dummiesExercise.chapter8.employees;

public class PartTimeEmployee extends Employee {

	
	private double hourlyRate;
	
/*	public PartTimeEmployee(String name, int empID, String deptCode, String startDate) {
		super();
		this.setName(name);
		this.setEmpID(empID);
		this.setDeptCode(deptCode);
		this.setStartDate(startDate);
	}
	*/
	
	public double findPaymentHours(int hours){
		return (hourlyRate * hours); 
		
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
	public double findPaymentAmount(int hours) {
		return hourlyRate * hours;
		}
	
	public PartTimeEmployee(){
		super();
		
	}
	
	
	
	
}
