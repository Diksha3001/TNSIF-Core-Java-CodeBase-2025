package com.tnsif.DayEightArrayDemo;

import java.util.Arrays;

public class SingledimensionalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,8,9,2,4,6};
		//print array
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//binary search
		System.out.println(Arrays.binarySearch(arr, 1));
		
		//get the second array
		int arr1[]= {1,8,0,2,5,8};
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		
		//comparison
		if(Arrays.compare(arr, arr1)==0)
		{
			System.out.println("Both array are same");
		}
		else
		{
			System.out.println("Both array are not same");
		}
		
		//copy array
		
		int arr2[]=Arrays.copyOf(arr1, 2);
		System.out.println(Arrays.toString(arr2));

		int arr3[]=Arrays.copyOfRange(arr, 1,4);
		System.out.println(Arrays.toString(arr3));
	
		//fill method
		Arrays.fill(arr3, 7);
		System.out.println(Arrays.toString(arr3));
		
		//length
		System.out.println("Length of arr1 ="+arr.length);
		System.out.println("Length of arr2 ="+arr2.length);
		System.out.println("Length of arr3 ="+arr3.length);
	}

}
