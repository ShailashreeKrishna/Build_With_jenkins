package com.training.model;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1=new Product(101, "Aircooler", 67000);
		Product product2=new Product(106, "Whirlpool", 77000);
		Product product3=new Product(110, "Mixer", 87000);
		Product product4=new Product(115, "LEDTV", 97000);
		Product product5=new Product(118, "washingmachine", 57000);
		Product product6=new Product(120, "Projector", 37000);
		
		
		Set<Product> order =new TreeSet<>();
		order.add(product1);
		order.add(product2);
		order.add(product3);
		order.add(product4);
		order.add(product5);
		order.add(product6);
		for(Product eachproduct:order) {
		
		System.out.println(order.toString());
		}
		

	}

}
