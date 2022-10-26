package control_Statement;

public class String_Methods {

	public static void main(String[] args) {

		String s = "Ganesh kumar";
		
		String replace = s.replace( "a", "o" );
		
		System.out.println(replace);
		
		String replace1 = s.replace( "e", "q" );
		
		System.out.println(replace1);
		
		System.out.println(replace1.replace( "q", "e" ));
		
		char charAt = s.charAt(3);
		
		System.out.println(charAt);
		
		String concat = s.concat(replace);
		
		System.out.println(concat);
		
	}

}