package control_Statement;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {

		// Make Right Angle Triangle by using (*);

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println("");
		}

		// Make sum value of array of 10;

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

		for (int i = 1; i <= 100; i++) {

			if (i == 5) {

				System.out.println(i);
			}
		}

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// program for print numbers from 1 to 10;

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
		
		int num;

		System.out.print("Enter any positive integer: ");
		
		num = scan.nextInt();

		System.out.println("Multiplication Table of " + num);

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + (num * i));
		}

		int nur; // To hold number int fact = 1; // To hold factorial

		System.out.print("Enter any positive integer: ");

		nur = scan.nextInt();

		int fact = 1;
		
		for (int i = 1; i <= nur; i++) {
			
			fact = fact * i;
		}

		System.out.println("Factorial: " + fact);

	}

}
