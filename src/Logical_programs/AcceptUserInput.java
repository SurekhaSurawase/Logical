package Logical_programs;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
		
		//WAP of addition of numbers using user i/p
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Addition of two numbers is: "+(a+b));
	

	}

}
