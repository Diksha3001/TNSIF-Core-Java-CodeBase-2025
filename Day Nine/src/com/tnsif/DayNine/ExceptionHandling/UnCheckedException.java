package com.tnsif.DayNine.ExceptionHandling;

public class UnCheckedException {

	public static void main(String[] args) {
		
		int arr[];
		try
		{
			arr=new int[] {1,2,3,4,5};
			System.out.println(arr[11]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("Exception Occured "+ae.getMessage());
		}
		
	}

}
