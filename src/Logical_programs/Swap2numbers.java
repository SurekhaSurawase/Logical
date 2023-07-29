package Logical_programs;

public class Swap2numbers {

	public static void main(String[] args) {

		//Swapping two numbers w/o using third variable
		
		int a = 20;
		int b = 10;
		
		System.out.println("Original Numbers a = "+a+"  b= "+b);
		a = a+b; //30
		b = a-b; //20 
		a = a-b; //10
		
		System.out.println("After swapping numbers are a = "+a+" b= "+b);
	}

}
