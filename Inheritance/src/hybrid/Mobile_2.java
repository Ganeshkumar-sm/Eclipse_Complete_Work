package hybrid;

public class Mobile_2 extends Mobile_1{
	public void modelName() {
		System.out.println("MODEL NAME : i6s");
	}

	public void displyType() {
		System.out.println("Disply Type : LED");
	}

	public void operatingSystem() {
		System.out.println("OS : ios");
	}
	public static void main(String[] args) {
		Mobile_2 obj = new Mobile_2();
		obj.companyName();
		obj.colour();
		obj.modelName();
		obj.displyType();
		obj.operatingSystem();
	}

}
