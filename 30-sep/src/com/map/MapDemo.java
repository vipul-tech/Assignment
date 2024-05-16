package com.map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String args[]) {
		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("Mobile", 10000);
		map.put("Earphone", 1000);
		map.put("Charger", 500);
		Integer i = map.get("Mobile");
		System.out.println(i);
	}
}
