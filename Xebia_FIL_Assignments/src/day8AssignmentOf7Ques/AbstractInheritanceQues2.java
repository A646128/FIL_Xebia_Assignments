package day8AssignmentOf7Ques;

import java.util.Scanner;

abstract class Book{
	 String title;
	 abstract void setTitle(String s);
	 String getTitle(){
	 return title;
	 }
	}
class MyBook extends Book{

	@Override
	void setTitle(String s) {
		title=s;
		
	}
	
}

public class AbstractInheritanceQues2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Title of the Book:");
		String bookname= sc.nextLine();
		MyBook mb=new MyBook();
		mb.setTitle(bookname);
		System.out.println("Title of the Book is "+mb.getTitle());

	}

}
