package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Question13 {

	public static void main(String[] args) {
		LinkedList<String>list1 = new LinkedList();
		list1.add("Sumit");
		list1.add("Amit");
		list1.add("Varun");
		System.out.println(list1+"\n");
		list1.addLast("Nikki");
		list1.addFirst("Pragati");
		System.out.println("Adding element at First and Last Place:\n"+list1);

	}

}
