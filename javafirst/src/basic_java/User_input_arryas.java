package basic_java;

import java.util.Scanner;

public class User_input_arryas {

	public static void main(String[] args) {

		System.out.println("ENter the subjects ");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int marks[] = new int[size];

		System.out.println("ENter the marks ");
		for (int i = 0; i < size; i++) {

			marks[i] = sc.nextInt();//

		}

		System.out.println("The mark is ");
		for (int i = 0; i < size; i++) {
			System.out.print(marks[i] + " , ");

		}

	}
}
