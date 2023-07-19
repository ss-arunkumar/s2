package day2;

import java.util.Scanner;

public class NameFunction {
	static void methoda(String n, String... name) {

		for (String s : name) {
			System.out.println(n + " " + s);

		}
	}

	public static void main(String[] args) {
		String a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();
		e = sc.next();
		methoda("Hello", a, b, c, d, e);
	}

}
