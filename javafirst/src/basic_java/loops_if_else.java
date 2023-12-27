package basic_java;

import java.util.Scanner;

public class loops_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();

		int i = 1;

		for (i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.print(i);
			} else {
				System.out.println();
			}
		}

	}
}
