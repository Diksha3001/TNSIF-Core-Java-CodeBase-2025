package com.tnsif.DayEleven.SetDemo;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> set =new HashSet<Student>();
		set.add(new Student(1010,"Diksha",87.5));
		set.add(new Student(1020,"Jyoti",89.5));
		set.add(new Student(1030,"Rutuja",89.10));
		set.add(new Student(1040,"Gayatri",90.5));
		set.add(new Student(1010,"Diksha",87.5));//duplicate data
		set.add(new Student(1080,"Diksha",97.5));
		
		System.out.println(set);
	}

}
