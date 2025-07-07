package com.tnsif.DayFour.AccessModifierDemo;

public class Demo {
	
	int varDefault =20;
	public int varPublic =80;
	private int varPrivate =40;
	protected int varProtected =90;

	void methodDefalult()
	{
		System.out.println("Default Acccess Demo Class");
		System.out.println("Default VAriable :"+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Acccess Demo Class");
		System.out.println("Public Variable :"+varPublic);
	}
	
	void methodProtected()
	{
		System.out.println("Protected Acccess Demo Class");
		System.out.println("Protected VAriable :"+varDefault);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Acccess Demo Class");
		System.out.println("Private VAriable :"+varPrivate);
	}
	
}
