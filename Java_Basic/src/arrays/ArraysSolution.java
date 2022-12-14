package arrays;

public class ArraysSolution {

	public static void main(String[] args) {
		// One Dimensional Array
		System.out.println("One Dimensional Array");
		int[] a1 = new int[6];
		int count = 1;
		// insert elements into the One Dimensional Array By using for loop

		for (int i = 0; i < a1.length; i++) {
			a1[i] = count;
			count++;
		}
		// Iterate over Array
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		// Two Dimensional Array
		// insert elements into the Two Dimensional Array By using for loop
		System.out.println("Two Dimensional Array");
		int[][] t = new int[3][4];
		int count1 = 1;
		
		int length = t.length;
		System.out.println(length);
		
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				
				t[i][j] = count1++;
			}
		}
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				System.out.print(t[i][j] + " ");
			}

			System.out.println();

		}
	}

}
