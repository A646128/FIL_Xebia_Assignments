package day10ExceptionAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileNotFoundExceptionQues2 {

	public static void main(String[] args) 
	{
        try {
			FileReader f=new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present, Please give the correct path or file.");
		}
        

	}

}
