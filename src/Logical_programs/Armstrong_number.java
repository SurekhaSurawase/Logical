package Logical_programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// Armstrong number is a number who is addition of cube of individual digits
		//ex: 153= 1cube+5cube+3cube=1+125+27=153
		
		System.out.println("checking if number is Armstrong number or not");
	
		System.out.println("Enter number:"); //153
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int original_num, rem, sum;
		original_num=num; //153
		
		for(sum=0; num>0; num=num/10) {//15=153/10, 1=15/10
			
			rem=num%10; //3=153%10, 5=15%10, 1=1%10
			sum=sum+rem*rem*rem; //27=0+3*3*3
								 //152=27+5*5*5
								 //153=152+1*1*1
		}
		
		if(original_num==sum) {
			System.out.println("Number is Armstrong number");
		}
		else
		System.out.println("Number is not a Armstrong number");
	}

}
