package com.oops.arrays;

import java.util.ArrayList;

public class ArrayListMethodsExample {
	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();

		// for adding elements
		arrayList1.add("Ravi");
		arrayList1.add("vijay");
		arrayList1.add("Ajay");
		arrayList1.add("Ravi");
		System.out.println("ArrayList output" + arrayList1);
		System.out.println("");

		// for adding elements based on index
		arrayList1.add(1, "Raju");
		System.out.println("ArrayList output by adding elements based on index" + arrayList1);
		System.out.println("");

		// for addAll method
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Mounika");
		arrayList2.add("Rajitha");
		arrayList1.addAll(arrayList2);
		System.out.println("ArrayList output of addAll method" + arrayList1);
		System.out.println("");
		// for isEmpty method
		System.out.println("Is ArrayList Empty: " + arrayList1.isEmpty());
		System.out.println("");
		// set and get methods for ArrayList
		arrayList1.set(1, "Gaurav");
		System.out.println("output after update of arrayList1" + arrayList1);
		System.out.println("");
		System.out.println("getting value from ArrayList: " + arrayList1.get(1));
		System.out.println("");
		// for getting size of ArrayList
		System.out.println("size of ArrayList: " + arrayList1.size());
		System.out.println("");
		// for contains method
		System.out.println("contains method of ArrayList: " + arrayList1.contains("Gaurav"));
		System.out.println("");
		// Removing specific element from arraylist
		arrayList1.remove("vijay");
		System.out.println("After remove method: " + arrayList1);
		System.out.println("");
		// Removing element on the based on index
		arrayList1.remove(0);
		System.out.println("Output After remove method based on index: " + arrayList1);
		System.out.println("");

		// for retainAll method
		// arrayList1.retainAll(arrayList2);
		// System.out.println("retaining the elements of arrayList2" + arrayList1);
		// System.out.println("");

		// Removing all the new elements from arrayList1
		arrayList1.removeAll(arrayList2);
		System.out.println("Output After removeAll method: " + arrayList1);
		System.out.println("");

		// Removing all the elements available in the arrayList1
		arrayList1.clear();
		System.out.println("After invoking clear() method: " + arrayList1);

	}

}
