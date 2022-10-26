package multiLevel;

public class Multilevel_2 implements Multilevel_1,Multilevel_Inheritance{

	@Override
	public void house1() {
System.out.println("hut");		
	}

	@Override
	public void house2() {
System.out.println("tile roof");		
	}

	@Override
	public void building_1() {
System.out.println("concrete");		
	}

	@Override
	public void building_2() {
System.out.println("Clay");		
	}
public static void main(String[] args) {
	Multilevel_2 obj = new Multilevel_2();
	obj.house1();
	obj.house2();
	obj.building_1();
	obj.building_2();
}
}
