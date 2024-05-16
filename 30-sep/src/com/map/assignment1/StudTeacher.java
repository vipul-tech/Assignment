package com.map.assignment1;

import java.util.*;

public class StudTeacher {
	public static void main(String args[]) {
		Map<Student,Teacher> map = new HashMap<Student,Teacher>();
		map.put(new Student(12,"Vikash","Maths"), new Teacher(1,"Shrinivashan"));
		map.put(new Student(13,"Sanjib","Biology"), new Teacher(2,"Veena"));
		map.put(new Student(11,"Sakshi","Computer Science"), new Teacher(3,"Shruti"));
		Student s1=new Student(15,"Richa","Physics");
		Teacher t1 = new Teacher(4,"Ram Narsh");
		map.put(s1, t1);
		
		for(Map.Entry<Student, Teacher> x : map.entrySet()) {
			System.out.println(x.getKey().getRollNo()+" "+x.getKey().getName()+" "+x.getKey().getFavouriteSubject()+" "+x.getValue().getName()+" "+x.getValue().getId());
		}
		
		System.out.println("Is map contains Richa (Student) as key? "+map.containsKey(s1));
		System.out.println("Is map contains Ram Naresh (Teacher) as value? "+map.containsValue(t1));
		map.remove(s1);
		
		System.out.println("After removing Richa...");
		
		for(Map.Entry<Student, Teacher> x : map.entrySet()) {
			System.out.println(x.getKey().getRollNo()+" "+x.getKey().getName()+" "+x.getKey().getFavouriteSubject()+" "+x.getValue().getName()+" "+x.getValue().getId());
		}
		
		System.out.println("Is map contains Richa (Student) as key? "+map.containsKey(s1));
		System.out.println("Is map contains Ram Naresh (Teacher) as value? "+map.containsValue(t1));
		
		System.out.println("Is map empty? "+map.isEmpty());
		System.out.println("After using clear() function...");
		map.clear();
		System.out.println("Is map empty? "+map.isEmpty());
	}
}
