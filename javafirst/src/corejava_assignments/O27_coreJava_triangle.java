package corejava_assignments;

class Triangle {

	double a;
	double c;
	double b;

	Triangle() {
		this.a = 3;
		this.b = 4;
		this.c = 5;
	}

	public void area(double base, double hight) {
		double Tangle = (base * hight) / 2;
		System.out.println("The area of Triangle is :" + Tangle);
	}

	public void parameter() {
		double pmeter = a + b + c;
		System.out.println("The parameter is " + pmeter);
	}
}

public class O27_coreJava_triangle {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.area(16, 4);
		tri.parameter();

	}

}
