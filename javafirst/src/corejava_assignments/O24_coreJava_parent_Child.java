package corejava_assignments;

class Parent {

	public void show() {
		System.out.println("This is parent class");
	}

}

class Child extends Parent {
	public void show() {
		System.out.println("This is child class ");
	}
}

public class O24_coreJava_parent_Child {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.show();
		Child c = new Child();
		c.show();
		Parent pc = new Child();
		pc.show();

	}
}
