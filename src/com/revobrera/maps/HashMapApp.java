package com.revobrera.maps;
import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		
		//HashMaps does not maintain order.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(12, "Twelve");
		map.put(15, "Fifteen");
		map.put(4, "Four");
		map.put(8, "Eight");
		map.put(10, "Ten");
		map.put(23, "Twenty-Three");
	
		//overwrite existing key 
		map.put(4, "Hello");
		
		String text = map.get(4);
		System.out.println(text);
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
	}

}
