package string;

public class Tring_Vowels {
	public static void main(String[] args) {

		String hr = "welcome";

		int vowels = 0;

		for (int i = 0; i < hr.length(); i++) {

			char ar = hr.charAt(i);

			switch (ar) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			//case 'w':
				vowels++;

			}

		}
		System.out.println(vowels);
	}

}
