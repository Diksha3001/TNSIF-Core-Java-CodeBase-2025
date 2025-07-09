package com.tnsif.DayEightArrayDemo;

public class ArrayOperation {


		static void print_array(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		
		//variable arg function
		public static int getSum(int... n)
		{
			int sum=0;
			for(int no:n)
				sum+=no;
			return sum;
		}
		
		//count no of odd elements
		
		public static int getOddCount(int b[])
		{
			int count=0;
			for(int i=0;i<b.length;i++)
			{
				if(b[i]%2!=0)
				{
					count++;
				}
			}
			return count;
		}
		
		public static int getEvenCount(int b[])
		{
			return b.length-getOddCount(b);	
		}
		
		public static void main(String[] args) {
			int n=10;
			int a[];
			a=new int[n];
			
			//display
			ArrayOperation.print_array(a);
			
			//assigining values
			for(int i=0;i<a.length;i++)
			{
				a[i]=5*i;
				ArrayOperation.print_array(a);
			}
			
			int b[]= {10,20,30,490}; //instantiation at the time of 
			ArrayOperation.print_array(b);
			
			//calling of variable arg function
			System.out.println("Sum of Array element is :"+ArrayOperation.getSum(b));
			System.out.println("Sum of Array element is :"+ArrayOperation.getSum(a));
			
			b[2]=999;
			
			ArrayOperation.print_array(b);
			
			//displaying total of Even no
			System.out.println("Odd Number="+ArrayOperation.getOddCount(b));
			System.out.println("Even Number="+ArrayOperation.getEvenCount(b));
			
			System.out.println();
		}
		
	

}
