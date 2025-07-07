package com.tnsif.daySix.FinalKeywordDemo;

public class FinalVariable {
	
	//final int a; final instance variable must be declared with initialize

	final int a=1;
	
	//declare a static blank final variable
	final static int b;
	
	final static int c=100;
	
	//instance method
	void change()
	{
		
//		a=25;	final variable can't be changed
//		c=90;	OR re-assign
	}

	@Override
	public String toString() {
		return "FinalVariable [a=" + a + " ,c="+c+"]";
	}

	//declare static block
	static 
	{
		b=60;
		//c=45;	 once initialized can't be reassigned
		System.out.println("B="+b);
	}
	
	public static void main(String[] args) {
		
		FinalVariable f=new FinalVariable();
		System.out.println(f);
		
	}
	
}
