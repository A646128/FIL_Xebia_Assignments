package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList();
		list.add("Sumit");
		list.add("Amit");
		list.add("Varun");
	Collections.sort(list);
	for(String sort:list)
	{
		System.out.println(sort);
	}

	}

}
