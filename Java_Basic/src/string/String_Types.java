package string;

public class String_Types {
	public static void main(String[] args) {
		// imutable
	/*String s = "Welcome To Java"; 
		 String ss = "Welcome To Java";
		 System.out.println(System.identityHashCode(s)+ System.identityHashCode(s));
		 System.out.println(System.identityHashCode(ss));
		 System.out.println(System.identityHashCode(s));
		
		 s=s+ss;
		 System.out.println(System.identityHashCode(s));*/
		 
		// mutable

		
		  StringBuffer s = new StringBuffer("Welcome To Java");
		  StringBuffer ss = new StringBuffer("Welcome To Java");
		  
		  System.out.println(System.identityHashCode(s));
		  System.out.println(System.identityHashCode(ss));
		  
		  s.append(s);
		  System.out.println(s);
		  System.out.println(System.identityHashCode(s));
		  
	
		
		}
		
}


