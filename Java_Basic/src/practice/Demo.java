package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws Exception {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter num: ");
		String r1 = br.readLine();
		System.out.println("Num is: " + r1);
		//int a = Integer.parseInt(r1);

		System.out.println("Enter num2: ");
		String r2 = br.readLine();
		System.out.println("Num is: " + r2);
	//	int b = Integer.parseInt(r2);
		
		System.out.println(r1 + r2);

	}

}
