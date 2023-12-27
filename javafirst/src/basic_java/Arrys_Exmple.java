package basic_java;

public class Arrys_Exmple {

	public static void main(String[] args) {
		int a[][] = { { 15, 30, 45 }, { 50, 60, 70 }, { 30, 60, 90 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************************************************");
		for(int i = 0; i<3 ; i++) {
			for (int j =0; j<3;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
