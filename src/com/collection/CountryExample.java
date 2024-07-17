package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CountryExample {

    public static void main(String[] args) {

        // Create ArrayLists for cities in each state
        ArrayList<String> a1MH = new ArrayList<String>();
        a1MH.add("pune");
        a1MH.add("mumbai");
        a1MH.add("nashik");
        System.out.println(a1MH);
        
        ArrayList<String> a1GJ = new ArrayList<String>();
        a1GJ.add("surat");
        a1GJ.add("rajkot");
        a1GJ.add("kach");
        System.out.println(a1GJ);

        ArrayList<String> a1Raj = new ArrayList<String>();
        a1Raj.add("jaipur");
        a1Raj.add("jodhpur");
        a1Raj.add("kota");
        
        System.out.println(a1Raj); 

        // Create HashMap to store states and their cities
        HashMap<String, ArrayList<String>> hmState = new HashMap<String, ArrayList<String>>();
        hmState.put("MH", a1MH);
        hmState.put("GJ", a1GJ);
        hmState.put("Raj", a1Raj);
        System.out.println(hmState);
       
     //   System.out.println("hmstate value"+hmState.get("MH"));
        
        // Create another HashMap to store country and its states
        HashMap<String, HashMap<String, ArrayList<String>>> hmPuraIndia = new HashMap<String, HashMap<String, ArrayList<String>>>();
        hmPuraIndia.put("India", hmState);

   
        System.out.println(hmPuraIndia);

        // Iterate through the HashMap
        Set<String> countryNames = hmPuraIndia.keySet();
        
        for (String countryName : countryNames) 
        {
            HashMap<String, ArrayList<String>> hmState1 = hmPuraIndia.get(countryName);
            Set<String> stateNames = hmState1.keySet();
            System.out.println(countryName + ":");
            for (String stateName : stateNames) {
                System.out.println(stateName + ":");
                ArrayList<String> cities = hmState1.get(stateName);
                for (String city : cities) {
                    System.out.println("  " + city);
                }
                System.out.println();
            }
        }
    }
}