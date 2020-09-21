package day16CollectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Sumit");
		al.add(1235);
		al.add('A');
		al.add(123.23);
		al.add(true);
		
		for(Object o: al)
		{
			System.out.println(o);
		}
		
	/*	Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

	}*/
	}

}
