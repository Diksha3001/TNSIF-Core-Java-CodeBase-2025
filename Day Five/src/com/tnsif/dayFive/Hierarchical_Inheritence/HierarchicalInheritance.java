package com.tnsif.dayFive.Hierarchical_Inheritence;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println("PERSON DETAILS");
		System.out.println(p);
		
		System.out.println("-----------------------");
		//Student s=new Student();
		Person p1;
		p1=new Person("Diksha","Satara");
		System.out.println("PERSON DETAILS : "+p1);
		
		p1=new Student("Adarsh","Chennai","BE",95f);
		System.out.println("Student Details :"+p1);
		
		p1=new Employee("Sunil","Solapur",1010,45000,"Computer");
		System.out.println("Employee Details :"+p1);
		
		
	}

}
