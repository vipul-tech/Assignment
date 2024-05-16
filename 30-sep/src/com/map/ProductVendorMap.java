package com.map;

import java.util.HashMap;
import java.util.Map;

public class ProductVendorMap {
	public static void main(String[] args) {
		Map<Product,Vendor> prodVendMap = new HashMap<Product,Vendor>();
		prodVendMap.put(new Product(1,"Mobile"),(new Vendor(10,"Vendor1")));
		prodVendMap.put(new Product(2,"Charger"),(new Vendor(20,"Vendor2")));
		prodVendMap.put(new Product(3,"Soap"),(new Vendor(30,"Vendor3")));
		prodVendMap.put(new Product(4,"Washing Machine"),(new Vendor(40,"Vendor4")));
		
		for(Map.Entry<Product,Vendor> x: prodVendMap.entrySet()) {
			System.out.println(x.getKey().getProdId()+" "+x.getValue().getVendorName());
		}
	}
}
