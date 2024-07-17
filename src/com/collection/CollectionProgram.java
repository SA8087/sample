package com.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> st1 = new ArrayList<Integer>();
		st1.add(45);
		st1.add(56);
		st1.add(77);
		System.out.println(st1);
		
		ArrayList<Integer> st2 = new ArrayList<Integer>();
		st2.add(33);
		st2.add(55);
		st2.add(88);
		System.out.println(st2);
		
		ArrayList<Integer> st3 = new ArrayList<Integer>();
		st3.add(99);
		st3.add(80);
		st3.add(77);
		System.out.println(st3);
		
		HashMap<String,ArrayList<Integer>> hm = new HashMap<String,ArrayList<Integer>>();
		
		hm.put("John", st1);
		hm.put("Blake", st2);
		hm.put("Scott", st3);
		System.out.println(hm);
		
	}	
}
