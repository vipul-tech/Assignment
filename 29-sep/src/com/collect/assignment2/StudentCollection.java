package com.collect.assignment2;

import java.util.*;

public class StudentCollection {
	public static void main(String args[]) {
		studentList();
	}
	public static void studentList() {
		List<Student> list = new LinkedList<Student>();
		list.add(new Student(1,"Ramesh","DAV"));
		list.add(new Student(1,"Rohit","DPS"));
		Student s1=new Student(1,"Ankit","RPS");
		Student s2=new Student(1,"Smriti","KV");
		Student s3=new Student(1,"Dolly","SVM");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		
		list.remove(s1);
		list.remove(s2);
		System.out.println("After removing elements s1 and s2");
		System.out.println(list);

		System.out.println("Is list contains s1? " + list.contains(s1));
		System.out.println("Is list contains s3? " + list.contains(s3));
		System.out.println("Is list empty ? " + list.isEmpty());
		Iterator<Student> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("After removing all elemnts...");
		list.clear();
		System.out.println("Is list empty ? " + list.isEmpty());
		
		
	}
}	
