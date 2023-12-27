package corejava_assignments;

public class O13_corJava_divide {
	public static void main(String[] args) {

		int i = 1;

		System.out.println("Divide by 3 :");
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nDivide by 5 : ");
		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nDivide by 3 and 5 both : ");
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}