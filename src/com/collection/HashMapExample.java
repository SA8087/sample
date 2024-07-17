package com.collection;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,String> hm = new HashMap<String,String>();
      hm.put("city", "pune");
      hm.put("marks", "45");
      hm.put("name", "john");
      System.out.println(hm);
     
     for(Map.Entry<String, String> h : hm.entrySet())
      
     {
    	System.out.println(h.getKey()+":"+ h.getValue()); 
     }
      
      
	}
}
