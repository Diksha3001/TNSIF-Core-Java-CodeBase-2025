//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class Check_EvenOddNo {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Number is Even or Odd :");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
