package com.tnsif.DayEight.StringDemo;

public class StringOperationDemo {

	public static void main(String[] args) {
		
		//createing string using literals --pool memory
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating new String operator --heap memory
		
		String s3=new String ("TNSIF");
		String s4=new String ("TNSIF");
		
		//==
		
		System.out.println("case 1 (s1==s2) :"+(s1==s2)); //true
		System.out.println("case 2 (s1==s3) :"+(s1==s3)); //false
		System.out.println("case 3 (s2.equals(s1) :"+(s2.equals(s1))); //true
		System.out.println("case 4 (s2.equals(s4)) :"+(s2.equals(s4))); //true
		System.out.println("case 5 (s3==s4) :"+(s3==s4));		//false
		System.out.println("case 6 (s3.equals(s4)) :"+(s3.equals(s4)));	//true
		
		System.out.println("Hashcode of "+s1+" is ="+s1.hashCode()); //s1=TNSIF
		System.out.println("Hashcode of "+s2+" is ="+s2.hashCode()); //s2=TNSIF
		System.out.println("Hashcode of "+s3+" is ="+s3.hashCode()); //s3=TNSIF
		
		String str="A";
		System.out.println("Hashcode of "+str+" is ="+str.hashCode()); //str=A
		
		//compare by using compareTo
		
		System.out.println(s1.compareTo(s4));
		System.out.println(str.compareTo(s4));
		
		
	}

}
