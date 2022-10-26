package loop;

import java.util.Arrays;

public class For_Each_or_Enhanced_For_Loop {

	public static void main(String[] args) {
		int array[] = { 12, 23, 44, 56, 77 };

		for (int i : array) {
			System.out.println(i);

		}
		String string = Arrays.toString(array);
		
		System.out.println(string);
	}

}

/*
 * used to traverse array or collection in java. it is easier to use than simple
 * for loop because we don't need to increment value and use subscript notation
 */