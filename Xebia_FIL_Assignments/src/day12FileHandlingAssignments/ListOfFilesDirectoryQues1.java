package day12FileHandlingAssignments;

import java.io.File;

public class ListOfFilesDirectoryQues1 {
	 public static void main(String[] args) {
		 File directoryPath = new File("C:\\XebiaAssignments");
	        String []path = directoryPath.list();
	        System.out.println("List of files and directories in the specified directory:");
	        for(int i=0; i<path.length; i++) {
	           System.out.println(path[i]);
	        }
	    }

}
