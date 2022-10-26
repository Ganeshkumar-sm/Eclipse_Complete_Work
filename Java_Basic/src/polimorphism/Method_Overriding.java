package polimorphism;

public class Method_Overriding {
	public void studentName(String name) {
		System.out.println(name);
	}

	public void studentId(int id) {
		System.out.println(id);
	}

	public void studentDept(String Dept) {
		System.out.println(Dept);
	}

	public static void main(String[] args) {
		Method_Overriding obj = new Method_Overriding();
		obj.studentName("Ganesh");
		obj.studentId(951);
		obj.studentDept("Dept");
	}

}
