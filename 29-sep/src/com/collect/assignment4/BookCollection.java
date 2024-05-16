package com.collect.assignment4;

import java.util.*;

public class BookCollection {
	public static void main(String args[]) {
		bookSet();
	}
	public static void bookSet() {
		Set<Book> prodSet = new TreeSet<Book>();
		prodSet.add(new Book(1,"Programming with c","R.P. Singh",300,10));
		prodSet.add(new Book(2,"Programming with c++","S.P. Sharma",400,4));
		Book b1 = new Book(3,"Data Structure and Algorithm","Abhishek Yadav",350,9);
		Book b2 = new Book(4,"Java Concepts","Malti Rastogi",500,13);
		Book b3 = new Book(5,"Fun with Python","R.D. Barman",375,23);
		Book b4 = new Book(5,"Fun with Python","R.D. Barman",375,23);
		prodSet.add(b1);
		prodSet.add(b2);
		prodSet.add(b3);
		prodSet.add(b4);
		
		System.out.println(prodSet);
		
		prodSet.remove(b1);
		prodSet.remove(b2);
		System.out.println("After removing elements b1 and b2");
		System.out.println(prodSet);

		System.out.println("Is set contains b1? " + prodSet.contains(b1));
		System.out.println("Is set contains b3? " + prodSet.contains(b3));
		System.out.println("Is set empty ? " + prodSet.isEmpty());
		
		Iterator<Book> itr=prodSet.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
		}  
	}
}
