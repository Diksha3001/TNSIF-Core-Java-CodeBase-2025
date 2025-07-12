package com.tnsif.DayNine.ExceptionHandling;

public class gretervalueException extends Exception {

	public gretervalueException(String str)
	{
		super(str);
	}
	public gretervalueException()
	{
		super("Percentage should not be greater than 100");
	}
}
