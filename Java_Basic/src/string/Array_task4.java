package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_task4 {
	// @SuppressWarnings("unused")
	public static void main(String[] args) {
		twoSums();

	}

	static void twoSums() {
		int num[] = { 2, 7, 11, 15 };

		int target = 26;

		// num.length = 4;

		String string = Arrays.toString(num);

		System.out.println(string + " = To Find the Indices of Array " + "\n" + "Which Addition Of 13");
		System.out.print("\n");
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < i; j++) {

				int r = num[i] + num[j];

				if (r == target) {

					List<Integer> li = new ArrayList<Integer>();

					li.add(i);
					li.add(j);

					System.out.println("Output: " + li);
					break;
				} else {
					continue;
				}
			}

		}

	}
}
