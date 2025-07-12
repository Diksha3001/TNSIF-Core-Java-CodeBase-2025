package com.tnsif.DayNine.ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
	 static int acceptNumber() {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	sc.close();
	return n;
	}
	public static void main(String[] args) {
		int per;
		System.out.println("Enter your percentage :");
		per=acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			else if(per>100)
				throw new gretervalueException();
			else
				System.out.println("Percentage ="+per);
		}
		catch(negativeException | gretervalueException e)
		{
			System.out.println("Error "+ e.getMessage());
		}

	}

}
