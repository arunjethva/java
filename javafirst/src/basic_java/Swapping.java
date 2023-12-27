package basic_java;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1 number ");
		int a = sc.nextInt();// 50

		System.out.println("Enter the 2 number");
		int b = sc.nextInt();// 100

		a = a + b;// a = 50+100 150
		b = a - b;// b = 150-100 50
		a = a - b;// a= 150-50 100

		System.out.println("After Swaping" + "\n" + "a = " + a + "\n" + "b = " + b);
	}

}
