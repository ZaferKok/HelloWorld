package lambda2020;

public class Market {
		
	private String workType;
	private String employee;
	private double salary;
	private int numOfEmp;
	
	public Market(String workType, String employee, double salary, int numOfEmp) {
		this.workType=workType;
		this.employee=employee;
		this.salary=salary;
		this.numOfEmp=numOfEmp;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType=workType;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee=employee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public int getNumOfEmp() {
		return numOfEmp;
	}
	public void setNumOfEmp(int numOfEmp) {
		this.numOfEmp=numOfEmp;
	}
	public String toString() {
		return workType +" - "+employee+" - "+salary+" - "+numOfEmp;
	}
}
