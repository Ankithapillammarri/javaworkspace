package com.capgemini.javafullstack.collection.list;

public class Product implements Comparable<Product> {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/*
	//To sort with respect to ID
	@Override
	public int compareTo(Product p) {
		if(this.id>p.id) {
			return 1;
	
		
	}else if(this.id<p.id) {
		return -1;

	}else {
		return 0;
	}

	}
	*/
//To sort with respect to Price
	@Override
	public int compareTo(Product p) {
	
		if(this.price>p.price) {
			return 1;
	
		
	}else if(this.price<p.price) {
		return -1;

	}else {
		return 0;
	}

	}
	
	/*
	@Override
	public int compareTo(Product p) {
		int val=this.name.compareTo(name);
				
		return val;
	}
	
	*/
	

	
	
	
	
}
