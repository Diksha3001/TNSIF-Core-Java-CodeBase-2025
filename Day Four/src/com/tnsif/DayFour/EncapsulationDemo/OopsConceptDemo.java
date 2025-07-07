package com.tnsif.DayFour.EncapsulationDemo;

public class OopsConceptDemo {
	private String name;
	private int id;
	private int age;
	public OopsConceptDemo()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "OopsConceptDemo [name=" + name + ", id=" + id + ", age=" + age + ", getName()=" + getName()
				+ ", getId()=" + getId() + ", getAge()=" + getAge()+"]";
	}
	
}
