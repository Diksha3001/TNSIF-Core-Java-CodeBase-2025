package com.tnsif.DayEleven.listDemo;
import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Ram");
		deque1.add("Lakhaman");
		deque1.add("Sita");
		deque1.add("Hanuman Ji");
	//	deque1.add(null);
		
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		System.out.println("Queue is =");
		for(String s: deque1)
			System.out.println(s);
	}

}
