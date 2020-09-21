package day16CollectionAssignments;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList();
		list.add("Sumit");
		list.add("Amit");
		for(String name:list)
		{
			System.out.println(name);
		}
		System.out.println("\nAfter inserting an element into the array list at the first position:");
		list.add(0, "Varun");
		for(String name:list)
		{
			System.out.println(name);
		}
		

	}

}
