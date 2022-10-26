package string;

public class Array_task2 {
	public static void main(String[] args) {

		// Input- a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		// Output-average-7.0

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int num = a.length;
		
		System.out.println("Length of Array: " + num);
		
		int b = 0;

		for (int i = 0; i < a.length ; i++) {

			b = b + a[i];

		}
		System.out.println("Average : " + b / num);

	}
}
