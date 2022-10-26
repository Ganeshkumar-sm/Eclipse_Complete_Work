package constructor;

import java.util.Scanner;

public class Scanner_1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner snr = new Scanner(System.in);

		System.out.println("channel");
		String name = snr.nextLine();
		System.out.println(name);

		System.out.println("channel no");
		float num = snr.nextFloat();
		System.out.println(num);

		System.out.println("viewers");
		String names = snr.next();
		System.out.println(names);

		System.out.println("channel set");
		int num1 = snr.nextInt();
		System.out.println(num1);

	}

}
