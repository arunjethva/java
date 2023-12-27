package corejava_assignments;

import java.util.concurrent.SynchronousQueue;

class Rectangle {
	double length;
	double breadth;

	Rectangle(double length, double breadth) {

		this.length = length;
		this.breadth = breadth;

	}

	public void area() {
		double rectArea = length * breadth;
		System.out.println("The area of Rectangle is :" + rectArea);
	}

	public void Parameter() {
		double paraMtr = 2 * (length + breadth);

	}
}

class Square extends Rectangle {

	public Square(double side) {
		super(side, side);
	}

}

public class O26_corejava_rectangle {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		Rectangle Square = new Square(0);
		rect.area();
		rect.Parameter();
		Square.area();
		Square.Parameter();	

	}
}
