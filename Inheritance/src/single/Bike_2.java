package single;

public class Bike_2 extends Bike_1 {
	
	public void bikeType() {
		System.out.println("Type : Cruize");
	}
	public void transmission() {
		System.out.println("No of gears : 5 gear");
	}
	public static void main(String[] args) {
		Bike_2 op = new Bike_2();
		op.nameOfTheBike();
		op.bikeType();
		op.power();
		op.powerTransmission();
		op.transmission();
		op.wheels();
		
		
	}

}
