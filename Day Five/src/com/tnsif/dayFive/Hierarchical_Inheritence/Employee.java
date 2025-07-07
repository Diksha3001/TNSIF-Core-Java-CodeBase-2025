package com.tnsif.dayFive.Hierarchical_Inheritence;

public class Employee extends Person {
//data members
	private int empId;
	private float salary;
	private String dept;
	
	//DEFAULT CONSTRUCTOR
	public Employee()
	{
		System.out.println("Employee Class Default Constructor");
		empId=1010;
		salary=40000f;
		dept="";
	}
	//PARAMETERIZED CONSTRUCTOR
	public Employee(String name,String city,int empId, float salary, String dept) {
		super(name,city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}

	//GETTER AND SETTER METHOD
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//toString method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getClass()=" + getClass()
				+ "]";
	}
	
}
