package multilevelInheritance;

public class Class_C extends Class_B {
	public void maleStudents () {
		System.out.println("Boy_1 : A");
		System.out.println("Boy_2 : B");
	}
	public void femaleStudents () {
		System.out.println("Girl_1 : a");
		System.out.println("Girl_2 : b");
	}
	public static void main(String[] args) {
		Class_C obj  = new Class_C ();
		obj.corresppondentName();
		obj.principalName();
		obj.englishTeacherNames();
		obj.tamilTeacherName();
		obj.mathsTeacherName();
		obj.scienceTeacherName();
		obj.femaleStudents();
		obj.maleStudents();
	}
	

}
