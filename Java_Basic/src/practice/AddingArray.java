package practice;

import java.util.*;

public class AddingArray {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 60));
		Set<Integer> s = new LinkedHashSet<Integer>();

		s.addAll(li);
		
		System.out.println(li);
		System.out.println(s);
	}

}
