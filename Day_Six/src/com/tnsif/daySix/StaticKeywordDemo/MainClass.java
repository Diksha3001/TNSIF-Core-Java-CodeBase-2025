package com.tnsif.daySix.StaticKeywordDemo;

public class MainClass {

	public static void main(String[] args) {
		MyClass.disp_static_method();
		MyClass m=new MyClass();
		System.out.println(m);
		
		MyClass.disp_static_method();
		
		MyClass m1=new MyClass();
		System.out.println(m1);
	}

}
