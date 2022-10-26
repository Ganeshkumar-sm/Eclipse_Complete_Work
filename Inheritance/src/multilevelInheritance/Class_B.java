package multilevelInheritance;

public class Class_B extends Class_A {
	public void principalName() {
		System.out.println("Name : Venugopal");
	}

	public void corresppondentName() {
		System.out.println("Name : Vathanagopal");
	}

	public static void main(String[] args) {
		Class_B obj = new Class_B();
		obj.corresppondentName();
		obj.principalName();
		obj.englishTeacherNames();
		obj.tamilTeacherName();
		obj.mathsTeacherName();
		obj.scienceTeacherName();
	}

}
