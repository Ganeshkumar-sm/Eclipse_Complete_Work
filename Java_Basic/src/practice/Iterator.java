package practice;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();

		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Kolkata");
		cityNames.add("Chandigarh");
		cityNames.add("Noida");

		// Iterator to iterate the cityNames
		java.util.Iterator<String> iterator = cityNames.iterator();

		System.out.println("CityNames elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " india");

		System.out.println("tamilnadu");
	}
}
