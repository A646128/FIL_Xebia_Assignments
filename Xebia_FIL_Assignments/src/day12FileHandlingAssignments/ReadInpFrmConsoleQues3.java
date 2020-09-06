package day12FileHandlingAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInpFrmConsoleQues3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		 BufferedReader R = new BufferedReader(ir);
		    System.out.print("Enter your Name: ");
		    String name = R.readLine();
		    System.out.println("Your Name is: " + name);

	}

}
