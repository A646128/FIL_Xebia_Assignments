package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList();
		list1.add("Sumit");
		list1.add("Amit");
		list1.add("Varun");
		list1.add("Nikki");
		Collections.swap(list1, 0, 3);
		for(String str:list1)
		{
			System.out.println(str);
		}

	}

}
