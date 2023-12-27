package corejava_assignments;

import java.util.Scanner;// enter  4
//1 
//2 3 
//4 5 6 
//7 8 9 10 
	                               

public class O07_coreJava_print_next {

	public static void main(String[] args) {

		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1, j = 1, count = 1;

		for (i = 1; i <= num; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(count + " ");
				count++;

			}
			System.out.println();
		}

	}
}
