package practice;

public class Practise_For_Interview {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);

		int[] m = new int[5];

		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;
		m[4] = 50;

		for (int im : m) {

			System.out.println(im);

		}
		int[] n = new int[10];

		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		n[3] = 40;
		n[4] = 50;
		n[5] = 60;
		n[6] = 70;
		n[7] = 80;
		n[8] = 90;
		n[9] = 100;

		int num = 0;

		for (int im : n) {

			num = num + im;
			

		}
		System.out.println(num);

		int[] k = { 10, 20, 20, 20, 30, 50, };

		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

		System.out.println(k[4]);
		
		String name = "Ganesh Kumar";
		
		String replace = name.replace("a", "o");
		System.out.println(replace);
		
		String[] split = name.split(" ");
		
		for (String string : split) {
			
			System.out.println(string);
			
		}
	}

}
