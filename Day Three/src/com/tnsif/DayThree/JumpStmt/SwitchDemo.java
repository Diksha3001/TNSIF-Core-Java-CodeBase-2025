package com.tnsif.DayThree.JumpStmt;

public class SwitchDemo {

	public static void main(String[] args) {
		String Day="Monday";
		switch(Day)
		{
		case "Monday" : System.out.println("Tody is Monday");
						break;
		case "Tuesday" : System.out.println("Tody is Tuesday");
						break;
		case "Thursday" : System.out.println("Tody is Thursday");
						break;
		case "Friday" : System.out.println("Tody is Friday");
						break;
		case "Saturday" : System.out.println("Tody is Saturday");
						break;
		case "Sunday" : System.out.println("Tody is Sunday");
						break;
		default : System.out.println("Invalid Day");
						break;
		
		}

	}

}
