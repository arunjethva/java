package tap_Acadamy;

class car {

	private String name;
	private int mileage;
	private int cost;

	public void setData(String x, int y, int z) {

		name = x;
		mileage = y;
		cost = z;

	}

	public String getName() {
		return name;
	}

	public int getMileage() {
		return mileage;
	}

	public int getcost() {
		return cost;
	}

}

public class Incapsulation_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car ();
		c.setData("BMD",10,7000000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getcost());
		
	}

}
