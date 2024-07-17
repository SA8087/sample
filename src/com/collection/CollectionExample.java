package com.collection;

import java.util.ArrayList;

public class CollectionExample {
	
	public static void main(String[] args) 
	
	{
		ArrayList <String> names = new ArrayList <String>();
		names.add("john");
		names.add("Blake");
		names.add("Scott");
		names.add("Joe");
		names.add("Smith");
		
		System.out.println(names);
		
		for(String s :names)
		{
			System.out.println(s);
		}
		
	}	
}
