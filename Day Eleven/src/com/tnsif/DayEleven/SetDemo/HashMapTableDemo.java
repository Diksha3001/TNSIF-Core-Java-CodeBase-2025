package com.tnsif.DayEleven.SetDemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101, "Diksha");
		ht.put(102, "Jyoti");
		ht.put(103, "Rutuja");
		ht.put(104, "Gayatri");
		ht.put(105, "Ram");
		ht.put(105, "Sita");
		System.out.println(ht);
		
		ht.putIfAbsent(110,"Hanuman Ji");
		System.out.println(ht);
		
		System.out.println(ht.get(110));
		
		System.out.println(ht.replace(104, "Ram"));
		System.out.println(ht);
		
		ht.clone();
		System.out.println("Copy using clone() method ="+ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		
		Collection<String> c=ht.values();
		System.out.println(c);
	}

}
