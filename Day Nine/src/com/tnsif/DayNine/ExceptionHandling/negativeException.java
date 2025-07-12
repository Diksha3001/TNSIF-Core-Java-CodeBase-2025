package com.tnsif.DayNine.ExceptionHandling;

public class negativeException extends Exception {
public negativeException(String str)
{
	super(str);
}
public negativeException()
{
	super("Percentage should not be negative");
}
}
