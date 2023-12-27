package new_Exeption;

import java.util.Scanner;

class vote {
	int age;

	public void age(int age) throws O02_Exeption2
	{
		if (age < 18) {
			int chake = 18 - age;
			throw new O02_Exeption2(chake);
		} else {
			System.out.println("you are not voting ");
		}
	}
}

public class O01_Exeption1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
		
		System.out.println("Enter the age "); 
		int age =sc.nextInt();
		
		vote v = new vote ();
		try {
			v.age(age);
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
}
