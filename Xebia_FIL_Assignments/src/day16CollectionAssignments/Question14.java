package day16CollectionAssignments;

import java.util.Collections;
import java.util.HashSet;

public class Question14 {

	public static void main(String[] args) {
		HashSet<String>hset = new HashSet();
		hset.add("Sumit");
		hset.add("Amit");
		hset.add("Varun");
		hset.add("Nikki");
		
		String[] new_array = new String[hset.size()];
	      hset.toArray(new_array);
	     System.out.println("Array elements: ");
	      for(String element : new_array){
	        System.out.println(element);
	      }

	}

}
