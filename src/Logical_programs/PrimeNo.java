package Logical_programs;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int n, count = 0;
		System.out.println("Enter any no");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();

		//n=3;
		for (int i = 1; i <= n; i++) {// 1<=3-----true 2<=3 3<=3 4<=3 false

			if (n % i == 0) {// 0----true 1----false 0-------true 3%2==0 false 3%3==0 true

				count++;// 1 2 

			}
			System.out.println(count); //1, 1, 2
		}
		if (count == 2)

			System.out.println("prime no");
		else
			System.out.println("no is not prime");

	}

}
