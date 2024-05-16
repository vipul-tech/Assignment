package com.map.assignment2;

import java.util.*;
import java.util.Map.Entry;

public class StateCapital {
	public static void main(String args[]) {
		Map<State,Capital> map = new LinkedHashMap<State,Capital>();
		map.put(new State(1,"Arunachal Pradesh"), new Capital(1,"Hyderabad"));
		State st = new State(2,"Bihar");
		Capital c = new Capital(2,"Patna");
		map.put(st, c);
		map.put(new State(3,"Rajasthan"), new Capital(3,"Jaipur"));
		map.put(new State(4,"West Bengal"), new Capital(3,"Kolkata"));
		
		for(Map.Entry<State, Capital> x : map.entrySet()) {
			System.out.println(x.getKey().getStateId()+" "+x.getKey().getName()+" "+x.getValue().getId()+" "+x.getValue().getCity());
		}
		
		System.out.println("Is map contains Bihar (State) as key? "+map.containsKey(st));
		System.out.println("Is map contains Patna (Capital) as value? "+map.containsValue(c));
		map.remove(st);
		
		System.out.println("After removing Bihar...");
		
		for(Entry<State, Capital> x : map.entrySet()) {
			System.out.println(x.getKey().getStateId()+" "+x.getKey().getName()+" "+x.getValue().getId()+" "+x.getValue().getCity());
		}
		
		System.out.println("Is map contains Bihar (State) as key? "+map.containsKey(st));
		System.out.println("Is map contains Patna (Capital) as value? "+map.containsValue(c));
		
		System.out.println("Is map empty? "+map.isEmpty());
		System.out.println("After using clear() function...");
		map.clear();
		System.out.println("Is map empty? "+map.isEmpty());
	}
}
