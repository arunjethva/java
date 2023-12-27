package basic_java;

import java.util.Scanner;

public class Result_arth {
	public static void main(String[] args) {// 35 fail 60-70 d 7080 c 8090 b 90 100 a 3659 pass 100up anter the carrect
											// marks

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks = sc.nextInt();

		if (marks > 0 && marks <= 35) {
			System.out.println("You are fail");
		} else if (marks >= 36 && marks <= 59) {
			System.out.println("Yor are pass ");
		} else if (marks >= 60 && marks <= 70) {
			System.out.println("You are in D class");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("You are in c class");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("You are in B class");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("Yor arw in A class");
		} else {
			System.out.println("Enter the currect marks ");
		}

		
		
	}
}
