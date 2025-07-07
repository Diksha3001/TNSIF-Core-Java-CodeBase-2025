package com.tnsif.DayFour.AccessModifierDemo1;

import com.tnsif.DayFour.AccessModifierDemo.Demo;

public class Demo1 {

	public static void main(String[] args) {
		
		//Access different package class in this package class
		//Only public members can be accessible
		Demo d=new Demo();
		d.methodPublic();
	}



}
