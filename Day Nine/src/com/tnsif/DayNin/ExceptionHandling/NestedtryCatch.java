package com.tnsif.DayNin.ExceptionHandling;

public class NestedtryCatch {
	
public static void check()
{
	String str="Diksha";
	int len=str.length();
	System.out.println("String Length :"+len);
	
	String str1=null;
	
	int y=10;
	
	try
	{
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException st)
		{
			System.err.println(st.getMessage());
		}
		System.out.println("String length:"+str1);
	}
	catch(NullPointerException n)
	{
		System.err.println(n.getMessage());
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
