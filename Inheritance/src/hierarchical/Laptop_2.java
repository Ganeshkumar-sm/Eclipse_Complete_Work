package hierarchical;

public class Laptop_2 extends Laptop_1 {
	public void modelName() {
		System.out.println("MODEL NAME : HT 2000");
	}

	public void displyType() {
		System.out.println("Disply Type : LED");
	}

	public void operatingSystem() {
		System.out.println("OS : Windows 10");
	}

	public static void main(String[] args) {
		Laptop_2 obj = new Laptop_2();
		obj.companyName();
		obj.colour();
		obj.modelName();
		obj.displyType();
		obj.operatingSystem();

	}

}
			