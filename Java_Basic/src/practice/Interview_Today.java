package practice;

import java.util.Scanner;

public class Interview_Today {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value: ");
		int n = sc.nextInt();
		

		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int row = 1; row <= n; row++) {
			
			for (int col = 0; col < n-row; col++) {
				System.out.print(" ");
			}
			for (int i = 0; i < row; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
