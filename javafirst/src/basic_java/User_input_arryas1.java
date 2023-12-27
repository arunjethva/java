package basic_java;

import java.util.Scanner;

public class User_input_arryas1 {
	public static void main(String[] args) {

		System.out.println("Enter the size of arrays");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		char bg[] = new char[size];

		System.out.println("Enter the bg ");
		int i = 0;

		for (i = 0; i < bg.length; i++) {
			bg[i] = sc.next().charAt(0);

		}
		System.out.println("The bg is :");
		for (i = 0; i < bg.length; i++) {
			System.out.print(bg[i] + " ");

		}

	}

}
