package day8AssignmentOf7Ques;

import java.util.Scanner;

class missingletters{
	public static void missingchar(char []ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			try
			{int val=(ch[i]-ch[i+1]);
			if (val!=-1)
			{
				int val1=ch[i]+1;
				char c=(char) val1;
				System.out.println(c);
			}
			}catch(ArrayIndexOutOfBoundsException e){
			
			}
		}
		
	}
}
public class MissingLettersQues7 {

	public static void main(String[] args) {
		{ 
			Scanner s = new Scanner(System.in);
		      System.out.println("Provide some characters:");
		      char[] a = s.next().toCharArray();
			System.out.println("Missing Letters are:");
			  missingletters.missingchar(a);
	      
	    } 

	}

}
