package corejava_assignments;

class Shape_1 {
	public void print() {
		System.out.println("This is Shape");
	}
}

class Rectangle_1 extends Shape_1 {
	public void printrect() {
		System.out.println("This is rectangular shape");
	}
}

class Circle_1 extends Shape_1 {
	public void printcirl() {
		System.out.println("This is circular shape ");
	}
}

class Square_1 extends Rectangle_1 {
	public void printsqr() {
		System.out.println("Square is a rectangle");
	}
}

public class O35_coreJava_Shape {
	public static void main(String[] args) {
		Square_1 sqr = new Square_1();
		sqr.print();
		Square_1 sqr1 = new Square_1();
		sqr1.printrect();

	}
}
