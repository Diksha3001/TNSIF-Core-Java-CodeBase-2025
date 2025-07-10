package com.tnsif.DayNin.ExceptionHandling;

public class TryCatchExample {
	static void method(int a,int b)
	{
		int div;
		try {
	
		 div=a/b;
		System.out.println("Division ="+div);
		}
		catch(ArithmeticException e)
		{
			if(b==0)
			{
				System.err.println("Exception Occured :"+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(4,2);
		method(90,3);
		method(80,4);
		method(4,4);
		method(4,0);
		method(64,0);
		method(64,2);
		method(64,0);
		


	}

}
