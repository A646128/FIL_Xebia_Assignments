
package day12FileHandlingAssignments;

import java.io.File;
import java.util.Scanner;

public class FileDirectoryExistsQues2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the full filename or directory name like C://XebiaAssignments:");
		String name=sc.next();
		 File file = new File(name);
        System.out.println("File_Directory Exists: "+file.exists());


	}

}
