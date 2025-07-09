package com.tnsif.DayEight.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//string buffer length 
		StringBuffer str=new StringBuffer("Hello");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		
		//appending and inserting into buffer
		String s;
		int a=23;
		str=new StringBuffer(60);
		s=str.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(str);
		
		str=new StringBuffer("I JAVA");
		str.insert(2, "LIKE ");
		System.out.println(str);
		
		str.delete(3, 6);
		System.out.println(str);
		
		System.out.println(str.reverse());
	}

}
