package hierarchical;

public class Laptop_3 extends Laptop_1 {
	public void modelName() {
		System.out.println("MODEL NAME : GS 1000");
	}

	public void displyType() {
		System.out.println("Disply Type : LCD");
	}

	public void operatingSystem() {
		System.out.println("OS : Windows XP");
	}

	public static void main(String[] args) {
		Laptop_3 obj = new Laptop_3();
		obj.companyName();
		obj.colour();
		obj.modelName();
		obj.displyType();
		obj.operatingSystem();
	}

}
