package practice;

import java.util.Scanner;

public class Leet_Palindrome {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();

		int org = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);
		if (org == rev) {
			System.out.println(rev + " is palindrome");
		} else {
			System.out.println(rev + "  is not palindrome");
		}
	}

}
