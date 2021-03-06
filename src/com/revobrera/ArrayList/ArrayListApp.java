package com.revobrera.ArrayList;
import java.util.ArrayList;
import java.util.List;


public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//add values
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("Iteration #1:");
		// indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		

		//removing items (careful)
		numbers.remove(numbers.size() -1);
		
		//this is VERY slow
		numbers.remove(0);
		
		
		System.out.println("\nIteration #2:");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		//List interfaces ...
		List<String> values = new ArrayList<String>();
		
	}

}
