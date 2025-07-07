package com.tnsif.association.has_a;

public class DisplayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("606 Kohinoor Begonia","Pune","Maharashtra","410507");
		Person p=new Person("Diksha",address);
		p.display();
		System.out.println(p);
	}

}
