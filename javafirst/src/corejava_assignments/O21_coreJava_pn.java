package corejava_assignments;

class PrintNumber {

	public void printn(int number) {
		System.out.println("Int  Value   is : " + number);
	}

	public void printn(float number) {
		System.out.println("float  Value  is :" + number);
	}

	public void printn(char ch) {
		System.out.println("Char  Value  is :" + ch);
	}

	public void println(String str) {
		System.out.println("String Value is :" + str);
	}

	public void printn(double point) {
		System.out.println("double   Value is :" + point);
	}

	public void printn(boolean abc) {
		System.out.println("boolean Value is :" + abc);
	}

	public void printn(long number) {
		System.out.println("long Value is :" + number);
	}
	public void printn(short number ) {
		System.out.println( number);
	}
	public void printn(byte number ) {
		System.out.println( "byte Value is :"+number);
	}
	
	
}

public class O21_coreJava_pn {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();

		pn.printn(10);
		pn.printn(1.1);
		pn.printn('a');
		pn.println("arun");
		pn.printn(12.123);
		pn.printn(false);
		pn.printn(45614);
		pn.printn(12);
		pn.printn(182);
		
	
		

	}
}
