package com.tnsif.DayNine.ExceptionHandling;
import java.util.*;

import javax.sound.midi.SysexMessage;
public class Division {
	
	static void divide()
	{
	
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("Division ="+c);
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException ae)
		{
			System.err.println(ae.getMessage());
		}
		catch(InputMismatchException ae)
		{
			System.err.println(ae.getMessage());	
		}
		catch(Exception ae)
		{
			System.err.println(ae.getMessage());	
		}
		finally
		{
			sc.close();
			System.out.println("Finally Block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide();
	}

}
