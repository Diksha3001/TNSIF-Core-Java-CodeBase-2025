package com.tnsif.dayFive.Hierarchical_Inheritence;

public class Person {
	private String name;
	private String city;
	
	//Default Constructor
	public Person() {
		System.out.println("Person Class Default Constructor :");
		name="Diksha";
		city="Pune";
		
	}
	
	//Parameterize Constructor
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	
	
	//Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
		
}
