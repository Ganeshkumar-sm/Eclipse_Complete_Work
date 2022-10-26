package polimorphism;

public class Method_Overriding_2 extends Method_Overriding {
	@Override
	public void studentName(String name) {
		System.out.println(name);
		super.studentName(name);
	}

	@Override
	public void studentId(int id) {
		System.out.println(id);
		super.studentId(id);
	}

	@Override
	public void studentDept(String Dept) {
		System.out.println(Dept);
		super.studentDept(Dept);
	}

	public void studentYear(int year) {
		System.out.println(year);
	}

	public void percentage() {
		System.out.println("percentage : 100 %");
	}

	public static void main(String[] args) {
		Method_Overriding_2 obj = new Method_Overriding_2();
		obj.studentName("rajesh");
		obj.studentId(987);
		obj.studentDept("marine");
		obj.percentage();
	}

}
