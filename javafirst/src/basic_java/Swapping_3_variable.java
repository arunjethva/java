package basic_java;

import java.util.Scanner;

public class Swapping_3_variable {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 number :");
		int num1 = sc.nextInt();

		System.out.println("Enter the 2 number :");
		int num2 = sc.nextInt();

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping" + "\n" + "num1 : = " + num1 + "\n" + "num2 : = " + num2);

	}
}
