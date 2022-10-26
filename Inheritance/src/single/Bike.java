package single;

public class Bike extends Bike_3 {
	public void bikeName() {
		System.out.println("Name : YAMAHA");
	}
	public void cubic_capacity() {
		System.out.println("CC : 500");
	}
	public static void main(String[] args) {
		Bike hr = new Bike();
		hr.bikeName();
		hr.brakeType();
		hr.cubic_capacity();
		hr.speedoMeter();
		
	}
}
