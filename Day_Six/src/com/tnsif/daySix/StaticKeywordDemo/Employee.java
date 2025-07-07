package com.tnsif.daySix.StaticKeywordDemo;

public class Employee {

	//Declaring VAriable
	private String name;
	private int id;
	
	//Declare static variable
	static String companyName="TCS";

	//Parameterized Constructor
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	//toString method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company Name="+companyName+"]";
	}
	
}
