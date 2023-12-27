package corejava_assignments;

import java.util.Scanner;

public class O01_coreJava_maxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1 = sca.nextInt();

		System.out.println("Enter the number2 :");
		int num2 = sca.nextInt();

		System.out.println("Enter the number 3 :");
		int num3 = sca.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " " + "number 1 is max ");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + "  " + "number 2 is max");
		} else {
			System.out.println(num3 + " " + "number 3 is max ");
		}

	}

}
