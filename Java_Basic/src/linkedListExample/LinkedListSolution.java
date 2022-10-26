package linkedListExample;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSolution {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(88);
		ll.add(84);
		
		System.out.println(ll);
		ll.sort(null);
		ll.remove(1);
		System.out.println(ll);
		
		
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(55);
		st.push(77);
		st.push(14);
		
		System.out.println(st);
		
		st.addAll(ll);
		System.out.println(st);
		
		

	}

}
