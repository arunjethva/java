package corejava_assignments;

abstract class Shape {

	public abstract void RectangleArea(double length, double breadth);

	public abstract void SquareArea(double side);

	public abstract void CircleArea(double redius);

}

class Area1 extends Shape {
	public void RectangleArea(double length, double breadth) {
		System.out.println("Area of Rectangle is " + length * breadth);
	}

	public void SquareArea(double side) {
		System.out.println("Area of Square is " + side * side);

	}

	public void CircleArea(double redius) {
		double pie = 3.14;
		System.out.println("Area of Circle is " + pie * redius * redius);
	}

}

public class O33_coreJava_Shape {
	public static void main(String[] args) {
		Area1 are = new Area1();

		are.RectangleArea(15, 5);

		are.SquareArea(4);

		are.CircleArea(10);

	}
}
