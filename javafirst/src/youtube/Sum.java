package youtube;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int addition = a + b;
		int subtraction= b - a;
		int multiplication = b * a;
		int divison = b / a;
		int modulo = a % b;

		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(divison);
		System.out.println(modulo);

	}
}
