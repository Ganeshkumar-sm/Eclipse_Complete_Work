package control_Statement;

public class Reverse_Rightangle_Triangle {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 1; j < 5 - i; j++) {

				System.out.print("  ");
			}

			for (int j2 = 0; j2 <= i; j2++) {

				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
