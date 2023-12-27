package corejava_assignments;

abstract class Parent1 {
	public abstract void message();
}

class FirstSubClass extends Parent1 {
	public void message() {
		System.out.println("This is first SubClass ");
	}
}

class secondSubClass extends Parent1 {
	public void message() {
		System.out.println("This is Second SubClass ");
	}
}

public class O29_coreJava_Abstrect {
	public static void main(String[] args) {

		Parent1 p1 = new FirstSubClass();
		p1.message();
		Parent1 p2 = new secondSubClass();
		p2.message();

	}
}
