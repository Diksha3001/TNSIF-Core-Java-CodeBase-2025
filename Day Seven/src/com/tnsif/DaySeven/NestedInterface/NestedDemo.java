package com.tnsif.DaySeven.NestedInterface;

public class NestedDemo implements OuterInterface,OuterInterface.InnerInterface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedDemo n1=new NestedDemo();
		n1.show();
		n1.calArea();
		n1.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This print Method");
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		System.out.println("This is Cal Area Methods");
	}
	
	public void show()
	{
		System.out.println("This is show Methods");
	}

}
