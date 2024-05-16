package com.collect.assignment1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeCollection {
	public static void main(String args[]) {
		employeeSet();
	}
	public static void employeeSet() {
		Set<Employee> set = new HashSet<Employee>();
		System.out.println("Is set empty? " + set.isEmpty());
		set.add(new Employee(1,"Ramesh",30000,"Clerk"));
		set.add(new Employee(2,"Rakesh",45000,"Tester"));
		Employee e1 = new Employee(3,"Somesh",30000,"Clerk");
		Employee e2 = new Employee(4,"Kamlesh",60000,"Manager");
		Employee e3 = new Employee(5,"Naresh",50000,"Programmer");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.println(set);
		
		set.remove(e1);
		set.remove(e2);
		System.out.println("After removing elements e1 and e2");
		System.out.println(set);

		System.out.println("Is set contains e1? " + set.contains(e1));
		System.out.println("Is set contains e3? " + set.contains(e3));
		System.out.println("Is set empty ? " + set.isEmpty());
		
		Iterator<Employee> itr=set.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
		}  
	}
}
