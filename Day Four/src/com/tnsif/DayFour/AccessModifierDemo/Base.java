package com.tnsif.DayFour.AccessModifierDemo;

public class Base {

	public static void main(String[] args) {
		
		// Access members from another class in same package
		// public,protected and default can be accessible but private members can't access
		Demo d=new Demo();
		d.methodDefalult();
		//d.methodPrivate();
		d.methodPublic();
		d.methodProtected();
		
		
	}

}
