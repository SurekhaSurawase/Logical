package Logical_programs;

public class FIbonacciSeries {

	public static void main(String[] args) {
		//Fibonacci Series is a series which starts from 0 and each digit is sum  of previous 2 numbers and so on.
		//0, 0,1,1,2,3,5,8,13,21,34,55...
		//Write a program to print first 10 numbers of fibonacci series.
		
		int a = -1;
		int b = 1;
		int c = 0;
		
		for (int  i =1; i<=10; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
