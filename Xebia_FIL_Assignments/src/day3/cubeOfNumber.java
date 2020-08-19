package day3;

import java.util.Scanner;

public class cubeOfNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner si= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=si.nextInt();
		System.out.print("Cube is: "+num*num*num);
	}

}
