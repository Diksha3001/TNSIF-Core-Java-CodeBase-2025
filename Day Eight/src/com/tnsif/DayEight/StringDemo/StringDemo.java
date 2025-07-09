package com.tnsif.DayEight.StringDemo;

public class StringDemo {
public static void main(String[] args) {
	//initialize string
	
	char c[]= {'I','N','D','I','A'};
	
	String s1=new String(c);
	System.out.println(c);
	
	String s2=new String(s1);
	System.out.println(s1);
	
	//concatination
	
	String str1="Ram ";
	String str2="Lakshuman";
	System.out.println("String 1="+str1);
	System.out.println("String 2="+str2);
	System.out.println("After Concatination Operation :");
	String str=str1+str2;
	System.out.println("Concat String ="+str);
	
	//toUppercase and toLowercase
	
	System.out.println("String 1 in Lower case ="+str1.toLowerCase());
	
	System.out.println("String 1 in Upper case ="+str1.toUpperCase());
	
	//length operation
	
	System.out.println("Length of String 1+"+str1.length());
	
	System.out.println("Length of String 2+"+str2.length());
	
	// substring operation
	
	String strig="Disconnect";
	System.out.println("Substring OPeration ="+strig.substring(3,10));
	
	//trim() method
	
	String strn="          Diksha       ";
	System.out.println("After trim operation ="+strn.trim());
	System.out.println("After trim operation ="+strn.stripTrailing());
	
	//isempty
	String rev="";
	System.out.println(strn.isEmpty());
	System.out.println(rev.isEmpty());
	
	
}
}
