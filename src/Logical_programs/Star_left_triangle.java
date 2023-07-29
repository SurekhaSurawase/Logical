package Logical_programs;

public class Star_left_triangle {

	public static void main(String[] args) {
		//Printing left taingle of star pattern
		
		for(int i=1; i<=5; i++) {//i=1
								 //i=2
			
			for(int j=1; j<=5; j++) {//j=1 2 3 4 5
									 //j=1
				
				if(j<=i) {//1<=1true, 2<=1 false 
						  //1<=2 true 2<=2 true 3<=2 false
				System.out.print("*"); //*
									   //**
				}
				else System.out.print("");
			}
			System.out.println();
		}
	}
}
