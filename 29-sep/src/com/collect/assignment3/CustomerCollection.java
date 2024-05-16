package com.collect.assignment3;

import java.util.*;

public class CustomerCollection {
	public static void main(String args[]) {
		customerSet();
	}
	public static void customerSet() {
		Set<Customer> prodSet = new LinkedHashSet<Customer>();
		prodSet.add(new Customer(1,"Ramesh"));
		prodSet.add(new Customer(2,"Rakesh"));
		Customer c1 = new Customer(3,"Somesh");
		Customer c2 = new Customer(4,"Kamlesh");
		Customer c3 = new Customer(5,"Naresh");
		Customer c4 = new Customer(5,"Naresh");

		prodSet.add(c1);
		prodSet.add(c2);
		prodSet.add(c3);
		prodSet.add(c4);
		
		System.out.println(prodSet);
		
		prodSet.remove(c1);
		prodSet.remove(c2);
		System.out.println("After removing elements c1 and c2");
		System.out.println(prodSet);

		System.out.println("Is set contains c1? " + prodSet.contains(c1));
		System.out.println("Is set contains c3? " + prodSet.contains(c3));
		System.out.println("Is set empty ? " + prodSet.isEmpty());
		
		Iterator<Customer> itr=prodSet.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
		}  
	}
}	
