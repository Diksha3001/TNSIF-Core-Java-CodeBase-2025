package com.tnsif.DayEleven.listDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		System.out.println("At starting checking List is empty "+list.isEmpty());
		

		list.add(10);
		list.add(100);
		list.add("Diksha");
		list.add("Sunita");
		list.add(true);
		list.add(false);
		list.add(10.10f);
		list.add(10);
		System.out.println("List Elements are"+list);
		
		System.out.println("List Size ="+list.size());
		System.out.println("First Index"+list.getFirst());
		System.out.println("Last Index="+list.lastIndexOf(list));
		System.out.println("Aftre Removing data which is present at 2 index="+list.remove(2));
		
		System.out.println("Generic List Demo.................");
		//generic
		List<String> names=new ArrayList<String>();
		names.add("Sita");
		names.add("null");
		names.add("Janaki");
		names.add("Vasundara");
		names.add("Kalki");
		System.out.println("Generic list ="+names);
		System.out.println("Reverse Order="+names.reversed());
		Collections.sort(names);
		System.out.println("Sorting Data ="+names);
		
		//traversing in list
		
		Iterator<String> it=names.iterator();
		while(it.hasNext())
		{
			String nm=it.next();
			System.out.println(nm+" ");
		}
		System.out.println("Display Data using iterator =");
		System.out.println(names );
		
		ListIterator<String> l=names.listIterator(names.size());
		System.out.println("Previous DAta =");
		while(l.hasPrevious())
		{
			String nm=l.previous();
			System.out.println(nm);
		}
	}

}
