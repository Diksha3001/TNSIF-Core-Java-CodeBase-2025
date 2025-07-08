package com.tnsif.DaySeven.InterfaceConcept;

public class BankDemo {

public static void main(String[] args) {
		
		SavingsAccount s1=new SavingsAccount("Zeel", "Pune", 1234567, 36000);
		
		s1.deposit(27000);
		System.out.println(s1);

		s1.withdraw(21000);
		System.out.println(s1);
		
		s1.withdraw(10000);
		System.out.println(s1);
		
		
		s1.withdraw(1);
		System.out.println(s1);
	}
}
