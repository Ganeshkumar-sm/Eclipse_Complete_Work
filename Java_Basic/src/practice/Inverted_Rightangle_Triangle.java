package practice;

public class Inverted_Rightangle_Triangle {

	public static void main(String[] args) {

		pattern1(5);

		pattern2(5);

	}

	static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n + 1 - row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

}
