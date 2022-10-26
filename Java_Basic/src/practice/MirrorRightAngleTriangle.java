package practice;

import java.util.Scanner;

public class MirrorRightAngleTriangle {
	public static void main(String[] args) {

		int n = 5;

		for (int j = 1; j <= n; j++) {

			for (int i = 1; i < n + 1 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number of rows: "); // takes input from user

			int rows = sc.nextInt();

			for (int i = 1; i <= rows; i++) {

				for (int j = 1; j <= rows - i; j++) {

					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {

					System.out.print("*");
				}
				System.out.println("");
			}
			sc.close();

		}
	}

}
