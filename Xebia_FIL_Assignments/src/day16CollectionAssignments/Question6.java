package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question6 {

	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList();
		list1.add("Sumit");
		list1.add("Amit");
		list1.add("Varun");
	
		ArrayList<String>list2 = new ArrayList();
		list2.addAll(list1);
		for (String copy:list2)
		{
			System.out.println(copy);
		}



	}

}
