package arrays;

import java.util.Arrays;

public class ArraysSort {

	public static int search(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// Sort And Search Over the Given Array

		int[] a = { 3, 8, 3, 6, 7, 4, 10, 1, 5, 11, 2 };

		System.out.println(a.length);

		String str = Arrays.toString(a);

		System.out.println(str);

		Arrays.sort(a);

		String str1 = Arrays.toString(a);

		System.out.println(str1);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 11) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		 int indexValue =  search(a, 10);
		
		if(indexValue == -1)
			System.out.println("No Element Found on Array");
		else
			System.out.println("Element found on array\nwith index of : "+indexValue);
	}

}
