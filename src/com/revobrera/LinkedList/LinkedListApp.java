package com.revobrera.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListApp {

	public static void main(String[] args) {
		/*
		* ArrayLists manage arrays internally...
		* [0][1][2][3][4][5] ... adding/ removing items at 
		* the beginning or at the end is very fast but slow
		* if removing items in the middle because you have to
		* shift items over. Use this often
		*/
		List<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * LinkedLists consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2] ...
		 *    <-   <-
		 * If you need to add/remove items at the beginning or
		 * the end then use LinkedLists.
		 */
		
		List<Integer> linkedList = new LinkedList<Integer>();
	
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
/*		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		*/
		//Add items elsewhere in list
		
		for (int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
	
	
	
	
	
	
}
