package arrays;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		int a1[] = { 5, 6, 1, 4, 7, 8, 9, };
		search(a1);

		String string = Arrays.toString(a1);

		System.out.println(string);

	}

	public static void search(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[k] > a[j]) {

					k = j;
				}

			}
			int swap = a[i];
			
			a[i] = a[k];

			a[k] = swap;

		}

	}

}
