package org.sundar;

public class Employee {
	
	int empId;
	String EmpName;
	double salary;
	
	
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.EmpName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
