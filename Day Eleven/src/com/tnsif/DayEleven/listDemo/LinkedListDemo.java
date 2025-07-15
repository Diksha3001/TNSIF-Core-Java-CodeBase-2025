package com.tnsif.DayEleven.listDemo;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(10);
		li.add(80);
		li.add(900);
		li.add(670);
		li.add(101);
		System.out.println(li);
		li.addFirst(1);
		System.out.println(li);
		li.add(3, 3);
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		
		ListIterator<Integer> l1=li.listIterator();
		while(l1.hasNext())
		{
			System.out.print(l1.next()+"\t");
			
		}
		System.out.println();
		l1=li.listIterator(li.size());
		while(l1.hasPrevious())
		{
			int n=l1.previous();
			System.out.print(n+"\t");
		}
	}

}
