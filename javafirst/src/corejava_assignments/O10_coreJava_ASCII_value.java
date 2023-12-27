package corejava_assignments;

import java.util.Scanner;

public class O10_coreJava_ASCII_value {
	public static void main(String[] args) {

		System.out.println("Enter the Character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		int a = ch;
		System.out.println(a);
		
	}

}
