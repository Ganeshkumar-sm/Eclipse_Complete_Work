package constructor;

public class Constructor_Class {
	public Constructor_Class() {
		System.out.println("Cars");
	}

	public Constructor_Class(String name) {
		System.out.println(name);
	}

	public Constructor_Class(String name, int num) {
		System.out.println(name + num);
	}

	public Constructor_Class(int num, int num1) {
		System.out.println(num + num1);
	}

	public static void main(String[] args) {
		new Constructor_Class();
		new Constructor_Class("Benz");
		new Constructor_Class("A Class"+ " " + 3);
		new Constructor_Class(320 + "  " + 520);

	}
}
