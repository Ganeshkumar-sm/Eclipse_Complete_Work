package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {

		List<Object> ar = new ArrayList<Object>();

		ar.add(55);

		ar.add(12);

		ar.add(45);

		ar.add(89);

		// System.out.println(ar);

		// Object object1 = ar.get(1);
		// System.out.println(ar.get(2));

		// Object set1 = ar.set(2, args);
		// System.out.println(set1);

		Object remove = ar.remove(3);
		System.out.println(remove);

		System.out.println(ar);

		int indexOf = ar.indexOf(45);
		System.out.println(indexOf);

		boolean contains = ar.contains(45);
		System.out.println(contains);

		// boolean removeAll = ar.removeAll(ar);
		// System.out.println(removeAll);

		boolean contains2 = ar.contains(45);
		System.out.println(contains2);

		boolean empty = ar.isEmpty();
		System.out.println(empty);

		
		
		boolean equals2 = ar.equals(remove);
		System.out.println(equals2);
		
		
		List<Integer> sr = new ArrayList<Integer>();
		
		sr.add(77);
		sr.add(45);
		sr.add(79);
		sr.add(55);
		sr.add(78);
		
		System.out.println(sr);
		
		ar.addAll(sr);
		
		System.out.println(ar);
		
		// return the common value to compare two list.
		
		ar.retainAll(sr);
		
		System.out.println(ar);
		
		// sort the value is assen and desenden
		
		Collections.sort(sr);
		
		System.out.println(sr);
		
		Collections.sort(ar,Collections.reverseOrder());
		
		System.out.println(ar);
		
		//Set <WrapperClass> refName = new TypesOfSet <WrapperClass> ();
		
		Set<Integer> in = new TreeSet <Integer>();
		
		in.add(798);
		in.add(4);
		in.add(7);
		in.add(99);
		in.add(7);
		//in.add(null);
		//in.add(null);
		
		System.out.println(in);
		
		
		
		
		
		

	}

}
