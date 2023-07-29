package Logical_programs;

public class Star_right_triangle {

	public static void main(String[] args) {
		//Printing right triangle * pattern
		
		for(int i=1; i<=5; i++) {//i=1
								 //i=2
			
			for(int j=1; j<=5; j++) {//j=1 2 3 4 5 
									  //j=1
				
				if(j>=6-i) {//1>=6-1:5 false 1>=6-2:4 false 1>=6-3:3 false 1>=6-4:2 false 1>=6-5:1 true
						    //2>=6-1:5 false 2>=6-2:4 false 2>=6-3:3 false 2>=6-4: 2 true 2>=6-5:1 true
					
					System.out.print("*");
				}
				else
					System.out.print(" ");//print 1 space, one space, one space,one space, print *
										  //print 1 space, one space, one space, *, *
			}
			System.out.println();
		}

	}

}
