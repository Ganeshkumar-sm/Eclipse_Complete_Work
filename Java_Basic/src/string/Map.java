package string;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		// key value ---> key+value=entry
		m.put(01, "first");
		m.put(02, "second");
		m.put(03, "third");
		m.put(04, "fourth");
		m.put(05, "fifth");

		System.out.println(m);

		String string = m.get(05);
		System.out.println(string);

		Set<Integer> ks = m.keySet();
		System.out.println(ks);

		int size = m.size();
		System.out.println(size);

		Collection<String> values = m.values();
		System.out.println(values);

		boolean containsKey = m.containsKey(05);
		System.out.println(containsKey);

		boolean containsValue = m.containsValue("third");
		System.out.println(containsValue);

		System.out.println("Entry Set");
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		boolean equals = m.equals(m);
		System.out.println(equals);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(06, "sixth");

		hm.putAll(m);

		System.out.println(hm);

		Set<Entry<Integer, String>> s = hm.entrySet();
		System.out.println(s);

		Iterator<Entry<Integer, String>> it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("Iterating");
		Set<Entry<Integer, String>> et = hm.entrySet();
		
		for (Entry<Integer, String> entry : et) {
			
			System.out.println(entry);
		}
		System.out.println();
		for (int i = 0; i < hm.size(); i++) {
			
			String string2 = hm.get(i);
			
			System.out.println(string2);
		}

		ks.forEach(System.out::println);
	}

}
