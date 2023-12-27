package basic_java;

import java.util.Scanner;

class O_2D_arrys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the column");
		int column = sc.nextInt();

		int metrix[][] = new int[rows][column];

		System.out.println("enter the eliments ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				metrix[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(metrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
