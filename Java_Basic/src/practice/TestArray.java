package practice;

import java.util.Arrays;

public class TestArray {

	static void min(int arr[]) {

		int mn = arr[0];

		//int length = arr.length;

		//System.out.println(length);

		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {

			if (mn > arr[i]) {

				mn = arr[i];
			}
			
		}
		System.out.println(mn);
		
	}

	public static void main(String args[]) {

		int a[] = { 33, 3, 2, 5, 1 };

		min(a);// passing array to method

	}
}
