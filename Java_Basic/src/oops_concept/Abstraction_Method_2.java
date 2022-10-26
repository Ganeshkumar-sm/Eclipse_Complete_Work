package oops_concept;

public class Abstraction_Method_2 extends Abstraction_Method {
	public void kumarGanesh() {
		System.out.println("Phython");
	}

	@Override
	public void ganeshKumar() {
		System.out.println("All Three");
	}

	public static void main(String[] args) {
		Abstraction_Method_2 obj = new Abstraction_Method_2();
		obj.ganesh();
		obj.kumar();
		obj.ganeshKumar();
		obj.kumarGanesh();
	}
}
