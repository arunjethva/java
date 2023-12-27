package corejava_assignments;

class Area {

	public void printArea(int lenth, int breadth) {
		int rectare = lenth * breadth;
		System.out.println("The Area of Rectangle is :" + rectare);
	}

	public void printArea(int side) {
		int squarea = side * side;
		System.out.println("The Square is:" + squarea);
	}
}

public class O23_corejava_Area {
	public static void main(String[] args) {

		Area a = new Area();
		a.printArea(4, 4);
		a.printArea(5);

	}

}
