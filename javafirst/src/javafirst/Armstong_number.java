package javafirst;

import java.util.Scanner;

public class Armstong_number {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int r, sum = 0;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + r * r * r;
		}

		if (temp == sum) {
			System.out.println("The number is Armstormg number");
		} else {
			System.out.println("The number is  not a Armstrong  number");
		}

	}
}
