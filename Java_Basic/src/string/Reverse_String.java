package string;

public class Reverse_String {

	public static void main(String[] args) {

		String name = "madam";
		
		int length = name.length();
		
		System.out.println(length);
		
	

		String rev = "";

		for (int i = name.length()-1 ; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		System.out.println(rev);
		
		if (rev.equals(name)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("bye");

		}
	}

}
