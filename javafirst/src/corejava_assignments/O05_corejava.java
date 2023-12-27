package corejava_assignments;

import java.util.Scanner;

public class O05_corejava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int num1 = sc.nextInt();

		System.out.println("Enter the Number 2");
		int num2 = sc.nextInt();

		System.out.println("Enter the Number 3");
		int num3 = sc.nextInt();

		System.out.println("Enter the Number 4");
		int num4 = sc.nextInt();

		System.out.println("Enter the Number 5");
		int num5 = sc.nextInt();

		int sum = num1 + num2 + num3 + num4 + num5;

		System.out.println("Sum is : " + sum + " ");

		double avg = sum / 5;

		System.out.println("Avg is :" + avg + " ");
	}

}
