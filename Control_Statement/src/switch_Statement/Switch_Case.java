package switch_Statement;

public class Switch_Case {
	public static void main(String[] args) {
		int num=2;
		switch(num+2) {
		
		case 1:
		    System.out.println("case 1: Value is: "+num);
		    break;
		case 2:
		System.out.println("case 2 : Value is: "+num);
		     break;
		case 3:
			System.out.println("case 3 : Value is : "+num);
			break;
		case 4 :
			System.out.println("case 4 : Value is : "+num);
			break;
		
			default:
				System.out.println("Default : Value is :"+num);
				break;
		}
	}
	

}

//int num=2; (variable)
//switch(num+2) (key word)((num=2)+2)
//case 4 (Required case)

