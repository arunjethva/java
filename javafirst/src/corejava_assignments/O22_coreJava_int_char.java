package corejava_assignments;

class IntChar {
//method overloding
	public void print(int n, char c) {
		System.out.println("int is: " + n + "char is :" + c);
	}

	public void print(char c, int n) {
		System.out.println("char is : " + c + "int is : " + n);
	}

}

public class O22_coreJava_int_char {

	public static void main(String[] args) {

		IntChar ic = new IntChar();
		ic.print(10, 'a');
		ic.print('A', 20);

	}

}
