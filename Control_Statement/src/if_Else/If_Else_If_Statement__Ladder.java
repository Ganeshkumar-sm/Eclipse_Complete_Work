package if_Else;

public class If_Else_If_Statement__Ladder {
	public static void main(String[] args) {
		int mark = 50;
		int num = 60;
		if (mark < 40) {
			System.out.println("Fail");
		} 
		else if (mark > 40 && mark <= 60) {
			System.out.println("Average");
		} 
		else if (mark > 60 && num <= 80) {
			System.out.println("Good");
		} 
		else if (mark > 80 && mark <= 100) {
			System.out.println("Very Good");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}

// only accept true condition
