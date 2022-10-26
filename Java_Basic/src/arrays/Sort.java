package arrays;

public class Sort {
	public static void searchSort(int[] a1) {

		for (int i = 0; i < a1.length; i++) {
			int k1 = i;

			for (int j = i + 1; j < a1.length; j++) {
				if (a1[k1] > a1[j]) {
					k1 = j;
				}
			}

			int swap = a1[i];
			System.out.println(swap);
			a1[i] = a1[k1];
			a1[k1] = swap;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
	}
	public static void main(String[] args) {

		int[] a1 = { 5, 8, 9, 7, 4, 6, 3, 1, 2 };
		searchSort(a1);

	}
}
