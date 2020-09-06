package day12FileHandlingAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileContentQues4 {

	public static void main(String[] args) {
		try  
		{  
		File file=new File("C://XebiaAssignments//file1.txt");  
		FileReader fr=new FileReader(file);  
		BufferedReader br=new BufferedReader(fr); 
		StringBuffer sb=new StringBuffer();  
		String line;  
		while((line=br.readLine())!=null)  
		{  
		sb.append(line);
		sb.append("\n");    
		}  
		fr.close();  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  

	}

}
