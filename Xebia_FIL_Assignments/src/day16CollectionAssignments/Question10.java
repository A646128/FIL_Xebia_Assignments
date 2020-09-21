package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question10 {

	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList();
		list1.add("Sumit");
		list1.add("Amit");
		list1.add("Varun");
		list1.add("Nikki");
		ArrayList<String>list2 = new ArrayList();
		list2.add("Sumit");
		list2.add("Amit");
		list2.add("Varun");
		list2.add("Pragati");
		ArrayList<String>list3 = new ArrayList();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);

	}

}
