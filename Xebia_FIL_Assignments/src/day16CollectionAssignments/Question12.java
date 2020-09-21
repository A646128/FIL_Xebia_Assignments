package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Question12 {

	public static void main(String[] args) {
		LinkedList<String>list1 = new LinkedList();
		list1.add("Sumit");
		list1.add("Amit");
		list1.add("Varun");
		list1.add("Nikki");
		System.out.println(list1+"\n");
		Collections.reverse(list1);
		System.out.println("After Reversing the Order:\n"+list1);

	}

}
