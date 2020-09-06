package day12FileHandlingAssignments;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFileQues5 {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("C:\\XebiaAssignments\\file1", true);
		fw.write("This is the appended data");

	}

}
