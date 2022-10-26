package oops_concept;

public class Fully_Abstraction_2 implements Fully_Abstraction {

	@Override
	public void friend_1() {
System.out.println("Name : sathish");		
	}

	@Override
	public void friend_2() {
System.out.println("Name : Dinesh");		
	}
	public static void main(String[] args) {
		Fully_Abstraction_2 obj = new Fully_Abstraction_2();
		obj.friend_1();
		obj.friend_2();
		
	}
	

}
