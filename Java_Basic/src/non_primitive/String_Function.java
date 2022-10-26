package non_primitive;

public class String_Function {

	public static void main(String[] args) {
		String s = "Welcome to Java";
		String m = "Welcome to Java";
		
		System.out.print("1. ");
		int length = s.length();
		System.out.println(length);

		System.out.print("2. ");
		boolean equals = s.equals(m);
		System.out.println(equals);

		System.out.print("3. ");
		boolean equalsIgnoreCase = s.equalsIgnoreCase(m);
		System.out.println(equalsIgnoreCase);

		System.out.print("4. ");
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		System.out.print("5. ");
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		System.out.print("6. ");
		boolean startsWith = s.startsWith("W");
		System.out.println(startsWith);

		System.out.print("7. ");
		boolean endsWith = s.endsWith("a");
		System.out.println(endsWith);

		System.out.print("8. ");
		boolean contains = s.contains("j");
		System.out.println(contains);

		System.out.print("9. ");
		int indexOf = s.indexOf("t");
		System.out.println(indexOf);

		System.out.print("10. ");
		int lastIndexOf = s.lastIndexOf("v");
		System.out.println(lastIndexOf);

		System.out.print("11. ");
		char charAt = s.charAt(lastIndexOf);
		System.out.println(charAt);

		System.out.print("12. ");
		String replace = s.replace(s, upperCase);
		System.out.println(replace);

		System.out.print("13. ");
		String substring = s.substring(indexOf);
		System.out.println(substring);

		System.out.print("14. ");
		boolean empty = s.isEmpty();
		System.out.println(empty);

		System.out.print("15. ");
		String[] split = s.split(" ");
		
		for (String string : split) {
			System.out.println(string);
		}

		System.out.print("16. ");
		String string = s.trim();
		System.out.println(string);

		System.out.print("17. ");
		int compareTo = s.compareTo(upperCase);
		System.out.println(compareTo);

		System.out.print("18. ");
		String String = s.concat(upperCase);
		System.out.println(String);

		System.out.print("19. ");
		String valueOf = java.lang.String.valueOf(lastIndexOf);
		System.out.println(valueOf);

		System.out.print("20. ");
		char[] charArray = s.toCharArray();
		System.out.println(charArray);

		System.out.print("21. ");
		String valueOf2 = java.lang.String.valueOf(indexOf);
		System.out.println(valueOf2);

	}
}
