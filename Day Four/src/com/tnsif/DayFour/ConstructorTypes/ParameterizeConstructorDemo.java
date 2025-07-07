package com.tnsif.DayFour.ConstructorTypes;
import java.util.*;
public class ParameterizeConstructorDemo {
	
	 int no1;
	 int no2;
	public ParameterizeConstructorDemo(int n1,int n2)
	{
		this.no1=n1;
		this.no2=n2;
	}
	public void display()
	{
		
		System.out.println("Addition ="+(no1+no2));
	}
	public static void main(String[] args) {
		int no1;
		int no2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		no1=sc.nextInt();
		System.out.println("Enter Second Number :");
		no2=sc.nextInt();		
		
		ParameterizeConstructorDemo pc=new ParameterizeConstructorDemo(no1,no2);
		
		pc.display();

	}

}
