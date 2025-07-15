package com.tnsif.DayEleven.listDemo;
import java.util.*;
public class QueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(80);
		q.add(40);
		q.add(20);
		System.out.println(q);
		
		int positionPeek=q.peek();
		System.out.println(positionPeek);
		
		int position =q.element();
		System.out.println("Using Element function ="+position);
		
		Iterator<Integer> l1=q.iterator();
		while(l1.hasNext())
		{
			System.out.print(l1.next()+"\t");
			
		}
		
		System.out.println();
		
		System.out.println(q.retainAll(q));
		
	}

}
