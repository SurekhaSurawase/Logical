package Logical_programs;

import java.util.Scanner;

public class Palimdrome_number {

	public static void main(String[] args) {
		//the number which is same if it is read from start to end or from end to start
		//ex: 1221
		//for this we need to create object of scanner class
		System.out.println("Check if number is a Palimdrome number or not");
		System.out.println("Enter number: ");
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int originalnum, rem;
		originalnum=num;
		int sum=0;
		
		for(sum=0; num>0; num=num/10) {
			
			rem=num%10;
			sum=sum*10+rem;
		}
		//System.out.println(sum);
		
		if(originalnum==sum) {
			System.out.println("Number is Palimdrome number");
		}
		else
			System.out.println("Number is not a Palimdrome number");

	}

}
