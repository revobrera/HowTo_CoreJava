package com.revobrera.sets;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author robrera7664
 *
 */
public class SetsApp {

	public static void main(String[] args) {
		//HashSet does not retain order: can spontaneously rearrange itself
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet remembers the orders you added items in
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in natural order: alphanumeric
		Set<String> set1 = new TreeSet<String>();
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty to start with");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding (no!)");
		}
		
		
		//adding duplicate items does nothing
		set1.add("mouse");
		
		System.out.println(set1);
		
		/// ITERATION ///
		for (String element : set1) {
			System.out.println(element);
		}
		
		/// DOES SET CONTAIN A GIVEN ITEM ///
		if (set1.contains("aardvark")) {
			System.out.println("Contains AARDVARK");
		}
		if (set1.contains("cat")) {
			System.out.println("Contains CAT");
		}
		
		/// INTERSECTION ///
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");		
		
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set2);
	}

}
