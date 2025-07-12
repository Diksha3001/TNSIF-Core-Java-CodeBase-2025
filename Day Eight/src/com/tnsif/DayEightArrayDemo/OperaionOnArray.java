package com.tnsif.DayEightArrayDemo;
import java.util.*;

public class OperaionOnArray {
	
	public static void swap(int arr[],int index1,int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	public static void reverse(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
		}
	}
	public static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(max<arr[i])
		{
			max=arr[i];	
		}
		}
		return max;
	}
	
	public static int min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements size :");
		int size=sc.nextInt();
		System.out.println("Enter Array Element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		int choice;
		do {
		System.out.println("1. Find Maximum Number from Array");
		System.out.println("2. Find Minimum Number from Array");
		System.out.println("3. Reverse the Array");
		System.out.println("4. Swap Array Elements from Array");
		System.out.println("5.Exit");
		System.out.println("Enter Choice for perform various operation on array from above options  : ");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Maximum Number :");
				int res=max(arr);
				System.out.println(res);
				break;
				
		case 2:System.out.println("Minimum Number :");
			    int val=min(arr);
			    System.out.println(val);
			    break;
		
		case 3:System.out.println("Reverse Array :");
				reverse(arr);
				System.out.println(Arrays.toString(arr));
				break;
				
		case 4:System.out.println("Enter Starting Index for swapping (Index is starting from 0) :");
				int start=sc.nextInt();
				System.out.println("Enter Ending Index for swapping (Index is ending with size-1 so put index less than size entered by you):");
				int end=sc.nextInt();
			System.out.println("Swap Array Elements :");
				swap(arr,start,end);
				System.out.println(Arrays.toString(arr));
				break;
				
		default:System.out.println("Invalid Choice");
		        break;
		}
		}while(choice!=5);
		
//		int a[]= {7,78,67,34,90,789,999,1064,64,5000};
//		//swap(a,0,5);
//		//System.out.println(Arrays.toString(a));
//		
//		System.out.println("Reverse Array :");
//		//reverse(a);
//		System.out.println(Arrays.toString(a));
//		
//		int res=max(a);
//		System.out.println("Maximum number :"+res);
//		
		
		
	}

}
