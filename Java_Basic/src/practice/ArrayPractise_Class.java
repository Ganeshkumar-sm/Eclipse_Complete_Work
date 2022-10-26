package practice;

public class ArrayPractise_Class {

	public static void main(String[] args) {
		set1();
	}

	static void set1() {

		int a[] = { 10, 20, 30, 40, 50, 60, 80 };

		int length = a.length;

		// length = 7;
		System.out.println("Array Length is : "+length);
		int sum = 0;

		for (int i = 0; i < length; i++) {

			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
