package corejava_assignments;

import java.util.Scanner;

public class O02_coreJava_vowelConstant {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner (System.in);
		
		char ch = sc.next().charAt(0);
		
		
		if (ch == 'A'|| ch == 'E'|| ch == 'I'||  ch == 'O'||  ch == 'U'|| ch =='a'|| ch == 'e'|| ch=='i'||ch=='o'|| ch == 'u' ) {
			System.out.println("The Character is Vowel");
			
		}else if ((ch>= 'a'&& ch <= 'z') || (ch>= 'A'&& ch <= 'Z'))
		{
			System.out.println("The chaeacter is a constant");
		}else {
			System.out.println("error");
			
		}
	}

}
