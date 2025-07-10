package com.tnsif.DayEightArrayDemo;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]=new Student[5];
		s[0]=new Student(13134,"Diksha");
		s[1]=new Student(13135,"Om");
		s[2]=new Student(13136,"Sakshi");
		s[3]=new Student(13137,"Jyoti");
		s[4]=new Student(13138,"Rushi");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Roll No :"+s[i].getRolno()+" Name : "+s[i].getName());
		}
		
		//declaed memory
		
	}

}
