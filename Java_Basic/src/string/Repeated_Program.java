package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repeated_Program {
	public static void main(String[] args) {

		Map<Object, Integer> m = new LinkedHashMap<Object, Integer>();
		String sr = ("What you think, What you Become");

		String[] spl = sr.split(" ");
	
		for (String md : spl) {

			if (m.containsKey(md)) {

				Integer hd = m.get(md);
				m.put(md, hd + 1);

			} else {
				m.put(md, 1);
			}
			System.out.println(m);
		}

		m.put("ganesh", 1);
		m.put("Kumar", 2);
		m.put("ramesh", 3);

		System.out.println(m);

		Integer in = m.get("Kumar");

		System.out.println(in);

		boolean containsKey = m.containsKey("Kumar");

		System.out.println(containsKey);

	}
}
