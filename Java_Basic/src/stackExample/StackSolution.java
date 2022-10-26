package stackExample;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
	public static void main(String[] args) {

		// Stack is a linear Data Structure
		// It Follows [ LIFO - Last Insert First Out ] Principle

		Stack<Integer> s1 = new Stack<>();

		s1.push(2);
		s1.push(8);
		s1.push(5);
		s1.push(6);
		s1.push(55);
		s1.push(4);

		System.out.println("PEEK THE LAST ELEMENT : "+s1.peek()+"\n");

		boolean empty = s1.empty();

		System.out.println("IS EMPTY OR NOT : "+empty+"\n");

		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		boolean empty1 = s1.empty();

		System.out.println("IS EMPTY OR NOT : "+empty1+"\n");
		s1.push(2);
		s1.push(8);
		s1.push(5);
		s1.push(6);
		s1.push(55);
		s1.push(4);

		System.out.println("SIZE : "+s1.size()+"\n");
		
		System.out.println("TOTAL STACK ELEMENTS : "+s1+"\n");
		
		Iterator<Integer> it = s1.iterator();
		System.out.println("Iterating over stack\nElements by using iterator :"+"\n");
		while (it.hasNext()) {
			Integer in = it.next();
			
			System.out.print(in+" ");
		}
		System.out.println("\n");
		System.out.println("Sorting the Elements in\nthe Stack by using sort method :"+"\n");

		s1.sort(null);
		System.out.println(s1);
		
	}
}
