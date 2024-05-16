package com.map.assignment3;

import java.util.Map;
import java.util.TreeMap;

public class SportsLegends {
	public static void main(String[] args) {
		Map<Sports,Legends> sportsLegends = new TreeMap<Sports,Legends>();
		sportsLegends.put(new Sports(1,"Cricket"),new Legends(1,"Virat Kohli"));
		sportsLegends.put(new Sports(2,"FootBall"), new Legends(2,"Cristiano Ronaldo"));
		sportsLegends.put(new Sports(3,"Badminton"), new Legends(3,"Saina Nehwal"));
		Sports s = new Sports(4,"Tennis");
		Legends l = new Legends(4,"Roger Federer");
		sportsLegends.put(s,l);
		sportsLegends.put(new Sports(5,"BasketBall"), new Legends(5,"LeBron James"));
		
		for(Map.Entry<Sports,Legends> e : sportsLegends.entrySet()) {
			System.out.println(e.getKey().getSportsName()+" ---> "+e.getValue().getPlayerName());
		}
		
		System.out.println("Is map contains Tennis (Sports) as key? "+sportsLegends.containsKey(s));
		System.out.println("Is map contains Roger Fedrer (Legends) as value? "+sportsLegends.containsValue(l));
		sportsLegends.remove(s);
		
		System.out.println("After removing Tennis...");
		
		for(Map.Entry<Sports,Legends> e : sportsLegends.entrySet()) {
			System.out.println(e.getKey().getSportsName()+" ---> "+e.getValue().getPlayerName());
		}
		
		System.out.println("Is map contains Tennis (Sports) as key? "+sportsLegends.containsKey(s));
		System.out.println("Is map contains Roger Fedrer (Legends) as value? "+sportsLegends.containsValue(l));
		
		System.out.println("Is map empty? "+sportsLegends.isEmpty());
		System.out.println("After using clear() function...");
		sportsLegends.clear();
		System.out.println("Is map empty? "+sportsLegends.isEmpty());
	}
}
