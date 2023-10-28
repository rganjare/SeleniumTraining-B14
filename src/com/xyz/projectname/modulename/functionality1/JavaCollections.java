package com.xyz.projectname.modulename.functionality1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
	
	
	public static void main(String[] args) {
		
		//jcList();
		//jcSet() ;
		
		jcHashTable();
		System.out.println("********************* Map/HashMap ******************");
		
		jcMap();
	}
	
	
	public static void jcList() {
		
		// List is a collection of Records
		
		List<String> list = new ArrayList<>();
		
		list.add("Selenium Training");
		list.add("Rahul Gupta");
		list.add("Poornima");
		list.add("Rajeev");
		list.add(null);
		list.add("8484848302302");
		list.add("");
		list.add("Poornima");
		
		System.out.println(list);
		
		System.out.println("*************************");
		for(int i=0; i<list.size(); i++) {		
			System.out.println(list.get(i));
		}
		System.out.println("**********Advance For Loop***************");
		
		for(String valuesfromlist : list) {		
			System.out.println(valuesfromlist);
		}
	}

	public static void jcSet() {
		
		// Set a collection of unique records
		// Will accept the null record
		// It allows to enter duplicate values/records
		
		Set<String> set = new HashSet<>();
		
		set.add("aSelenium Training");
		set.add("bRahul Gupta");
		set.add("cPoornima");
		set.add("bRahul Gupta");
		set.add("dRajeev");
		set.add(null);
		set.add("e8484848302302");
		set.add("");
		set.add(null);
		set.add(null);
		set.add("cPoornima");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		System.out.println("**********While loop with Iterator***************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	public static void jcHashTable() {
		
		// Hashtable is a collection of Key and value pair (Record)
		// Allowing to add duplicate value/record but it will override the previous value
		// Not accepting null Key and value (both)
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("Training", "Selenium");
		ht.put("Training", "Appium");
		ht.put("Training", "Java");
		ht.put("Training", "Car Driving");
		
		ht.put("Name", "Rahul");
		ht.put("Name", "Rajeev");
		
		ht.put("City", "Mumbai");
		ht.put("City", "Pune");
		ht.put("City", "HYD");
		ht.put("City", "Chennai");
		
	//	ht.put("State", null);
	//	ht.put("Car", null);
		
	//	ht.put(null, "India");
				
	//	ht.put(null, null);
		
		ht.put("", "");
		
		ht.put("Profession", "IT");
		
		ht.put("", "XYZ-Road");
		
		System.out.println(ht);
		
		System.out.println(ht.get("Training"));
		System.out.println(ht.get("City"));
		System.out.println(ht.get("Name"));		
		System.out.println(ht.get(""));
		System.out.println(ht.get("Profession"));
	}

	public static void jcMap() {
		
		// Map is a collection of Key and value pair (Record)
		// Allowing to add duplicate value/record but it will override the previous value		
		//  Accepting null Key and value Or both
		
		Map<String, String> map = new HashMap<>(); // Not recommended 
		
		map.put("Training", "Selenium");
		map.put("Training", "Appium");
		map.put("Training", "Java");
		map.put("Training", "Car Driving");
		
		map.put("Name", "Rahul");
		map.put("Name", "Rajeev");
		
		map.put("City", "Mumbai");
		map.put("City", "Pune");
		map.put("City", "HYD");
		map.put("City", "Chennai");
		
		map.put("State", null);
		map.put("Car", null);		
		map.put(null, "India");
				
		//map.put(null, null);
		
		map.put("", "");
		
		map.put("Profession", "IT");
		
		//map.put("", "XYZ-Road");
		
		System.out.println(map);
		
		System.out.println(map.get("Training"));
		System.out.println(map.get("City"));
		System.out.println(map.get("Name"));		
		System.out.println(map.get(""));
		System.out.println(map.get("Profession"));
		System.out.println(map.get(null));
		System.out.println(map.get("State"));
		System.out.println(map.get("Car"));
		
	}
}
