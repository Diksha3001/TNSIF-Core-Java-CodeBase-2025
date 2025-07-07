package com.tnsif.daySix.FinalKeywordDemo;

final class FinalClassDemo {
	void disp()
	{
		System.out.println("Final Class can't be inherited");
	}
	
	
}
public class FinalClass
{
public static void main(String[] args) {
	FinalClassDemo fc=new FinalClassDemo();
	fc.disp();
	}
}