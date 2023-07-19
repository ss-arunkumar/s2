package day2;

import java.util.Scanner;

public class LargestFactor {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		int a = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				a = i;
			}
		}
		System.out.println("Largest factor is " + a);
	}

}
