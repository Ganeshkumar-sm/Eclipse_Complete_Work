package practice;

public class Interview {

	public static void main(String[] args) {
		String str = "madam";
		int len = str.length();
		System.out.println(len);
		System.out.println(str);
		str.replace("e", "a");
		System.out.println(str.replace("e", "a"));

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println(rev + " pal");

		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
