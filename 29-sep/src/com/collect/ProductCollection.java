package com.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductCollection {

	public static void main(String[] args) {
		productList();
	}
	
	public static void productList(){
		//List<Product>  prodList = new LinkedList<Product>();
		List<Product>  prodList = new ArrayList<Product>();
		
		prodList.add(new Product(12,"bluetooth"));
		prodList.add(new Product(43,"headphones"));
		prodList.add(new Product(9,"usbcable"));
		prodList.add(new Product(1,"adapter"));
		prodList.add(new Product(22,"Mobile"));
		
		prodList.set(0, new Product(100,"A"));
		System.out.println(prodList.indexOf(new Product(1,"adapter")));
	/*
		Collections.sort(prodList); // this requires compareTo() of Product class
			Iterator<Product>  itr = prodList.iterator();
			while(itr.hasNext()){
				Product temp = itr.next();
				System.out.println(temp.getProdId()+" "+temp.getProdName());
			    prodList.add(new Product(100,"A")); 
			}
		*/
		
		//System.out.println(prodList);
	}
	
	public static void productSet(){
		//List<Product>  prodList = new LinkedList<Product>();
		Set<Product>  prodSet= new HashSet<Product>();
		prodSet.add(new Product(22,"Mobile"));
		prodSet.add(new Product(12,"bluetooth"));
		prodSet.add(new Product(43,"headphones"));
		prodSet.add(new Product(9,"usbcable"));
		prodSet.add(new Product(1,"adapter"));

		for(Product p : prodSet){
			System.out.println(p.getProdId()+""+p.getProdName());
		}
		/*Iterator<Product>  itr = prodSet.iterator();
		while(itr.hasNext()){
			Product temp = itr.next();
			System.out.println(temp.getProdId()+" "+temp.getProdName());
			//itr.remove();
		}*/
		//System.out.println(prodSet.contains(new Product(22,"Mobile")));
	
		//System.out.println(prodSet);
	}
}

