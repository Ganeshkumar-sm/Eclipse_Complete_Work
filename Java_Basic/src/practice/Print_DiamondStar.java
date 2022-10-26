package practice;

public class Print_DiamondStar {

	public static void main(String[] args) {
		printDiamond(6);
	}
	// JAVA Code to print
	// the diamond shape

	static void printDiamond(int n) {
		int space = n ;

		// run loop (parent loop)
		// till number of rows
		for (int i = 0; i < n; i++) {
			// loop for initially space,
			// before star printing
			for (int j = 0; j < space; j++)
				System.out.print(" ");

			// Print i+1 stars
			for (int j = 0; j <= i; j++)
				System.out.print("* ");

			System.out.print("\n");
			space--;
		}
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
		System.out.println();
		// Repeat again in
		// reverse order
		space = 1;

		// run loop (parent loop)
		// till number of rows
		for (int i = n; i > 0; i--) {
			// loop for initially space,
			// before star printing
			for (int j = 0; j < space; j++)
				System.out.print(" ");

			// Print i stars
			for (int j = 0; j < i; j++)
				System.out.print("* ");

			System.out.print("\n");
			space++;
		}
	}

	// Driver Code

	// This code is contributed
	// by Arnav Kr. Mandal.
}
