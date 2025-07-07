package com.tnsif.daySix.StaticKeywordDemo;

public class MyClass {

	private int section;		//Non Static Variable
	private static int SrNo; 	//Static VAriable
	
	static
	{
		System.out.println("WITHHIN STATIC BLOCK");
		SrNo=1290;
	}

	//DEFAULT CONSTRUCTOR
	public MyClass() {
		
		System.out.println("Within Default Constructor");
		SrNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [Serial No "+SrNo +" ,section=" + section + "]";
	}
	
	//Static Method
	static void disp_static_method()
	{
		System.out.println("Serial No :"+SrNo);
	}
	
}
