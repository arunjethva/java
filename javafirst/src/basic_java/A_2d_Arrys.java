package basic_java;

import java.util.Scanner;

public class A_2d_Arrys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the collams");
		int collams = sc.nextInt();

		int metrix[][] = new int[rows][collams];

		System.out.println("Enter the elimets ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collams; j++) {
				metrix[i][j] = sc.nextInt();

			}
		}
		System.out.println("the Eliments is ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collams; j++) {
				System.out.print(metrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
