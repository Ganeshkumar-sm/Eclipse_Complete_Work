package string;

import java.util.Arrays;

public class Array_task {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int length = a.length;

		System.out.println(length);
		
		String string = Arrays.toString(a);
		
		System.out.println(string);
		
		String string2 = Arrays.toString(a);
		System.out.println(string2);
		int b = 0;

		for (int i = 0; i <= a.length -1; i++) {

			b = b+ a[i];

		}

		System.out.println(b);
		
		int x[] = new int[5];
		
		x[0]=1;
		x[1]=2;
		x[2]=32;
		x[3]=58;
		x[4]=88;
		
		String string3 = Arrays.toString(x);
		System.out.println(string3);
		
		for (int i = 0; i < x.length; i++) {
			int j = x[i];
			System.out.println(j);
		}
		
	}

}
