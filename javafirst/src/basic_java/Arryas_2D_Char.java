package basic_java;

public class Arryas_2D_Char {

	public static void main(String[] args) {
		char a[][] = { { 'a', 'A' }, { 'e', 'E' }, { 'i', 'I' }, { 'o', 'O' }, { 'u', 'U' } };
		char b[][] = { { 'a', 'p' }, { 'b', 'p' }, { 'c', 'p' }, { 'd', 'p' }, { 'e', 'p' } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}


	}
}