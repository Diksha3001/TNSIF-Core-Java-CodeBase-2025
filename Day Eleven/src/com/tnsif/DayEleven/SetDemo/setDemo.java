package com.tnsif.DayEleven.SetDemo;
import java.util.*;
public class setDemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(20);
		set.add(90);
		set.add(900);
		set.add(100);
		set.add(5);
		
		System.out.println(set);
		
		boolean b=set.contains(100);
		System.out.println(b);
		
		boolean b2=set.isEmpty();
		System.out.println(b2);
		
		set.remove(100);
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
				while(i.hasNext())
				{
					System.out.print(i.next()+" ");
				}
	}

}
