package dataType_Byte;

public class Datatypes_Practice {
	public void add() {
		int a = 12;
		int b = 24;
		long c = 56;
		short d = 25;
		System.out.println(a+b+c-d+ " : Integer");	
	}
	public void division() {
		int a = 12;
		int b = 24;
		System.out.println(b/a+" : divition");
	}
	public void Dt(int a) {
		System.out.println(a+" : datatype");
	}
	public void Dt(String a,int b) {
		System.out.println(a+" " +" "+ b +" dataorder");		
	}
	public void Dt(int a, String b) {
		System.out.println(a+" " + b +" "+ "datacount");

	}
	public static void main(String[] args) {
		Datatypes_Practice ot = new Datatypes_Practice();
		ot.add();
		ot.division();
		ot.Dt(57);
		ot.Dt("null", 50);
		ot.Dt(50, "value");
		
	}
	
	
	

}
