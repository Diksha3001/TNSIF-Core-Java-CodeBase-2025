package com.tnsif.DayEightArrayDemo;

public class JaggedArray {static void printArray(int arr[][])
{
	System.out.println("Array Elements are following :");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	
	int a[][]= {{1,2},{3,4},{10,11,4},{7,56,4,7},{23}};
	printArray(a);
}
}