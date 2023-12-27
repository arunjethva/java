package corejava_assignments;

abstract class Marks {
	public abstract float getPercentage();
}

class A extends Marks {
	private float Marks1, Marks2, Marks3;

	public A(float M1, float M2, float M3) {
		Marks1 = M1;
		Marks2 = M2;
		Marks3 = M3;

	}

	public float getPercentage() {
		return ((Marks1 + Marks2 + Marks3) / 300) * 100;
	}
}

class B extends Marks {
	private float Marks1, Marks2, Marks3, Marks4;

	public B(float M1, float M2, float M3, float M4) {
		Marks1 = M1;
		Marks2 = M2;
		Marks3 = M3;
		Marks4 = M4;
	}

	public float getPercentage() {
		return ((Marks1 + Marks2 + Marks3 + Marks4) / 400) * 100;
	}
}

public class O31_coreJava_calculator {
	public static void main(String[] args) {
		A StudentA = new A(50, 60, 70);
		System.out.println("percentage of StudentA :" + StudentA.getPercentage());
		B StudentB = new B(50, 60, 70, 80);
		System.out.println("percentage of StudentB :" + StudentB.getPercentage());

	}

}
