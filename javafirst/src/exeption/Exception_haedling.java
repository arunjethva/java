package exeption;

import java.util.Scanner;

public class Exception_haedling {

	public static void main(String[] args) {
		System.out.println("Enter the age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		
		if (age<=18) {
			System.out.println("You cannot vote");
		}else {
			System.out.println("you can vote ");
		}
	
	}
}
