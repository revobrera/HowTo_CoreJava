package com.revobrera.SortedMaps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class SortedMapsApp {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		
		System.out.println("==== DISPLAYS UNORDERED ====");
		testMap(hashMap);
		System.out.println("==== DISPLAYS AS IT IS ENTERED ====");
		testMap(linkedHashMap);
		System.out.println("==== DISPLAYS NUMERICALLY ORDERED ====");
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(1, "Dog");
		map.put(2, "Pig");
		map.put(4, "Cat");
		map.put(7, "Penguin");
		map.put(100, "Godzilla");
		map.put(200, "Butterfly");
		map.put(3000, "Grizzly Bear");
		
		for (Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
			
		}
	}

}
