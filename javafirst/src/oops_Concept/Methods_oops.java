package oops_Concept;

class Teacher {

	int salary;
	String subjecct;

	public void tiching(int salary, String subject) {

		System.out.println(salary + " " + subject);

	}

}

public class Methods_oops {
	public static void main(String[] args) {

		Teacher t = new Teacher();
		t.tiching(95000, "Java");

		Teacher t2 = new Teacher();
		t2.tiching(50000, "c++");

		Teacher t3 = new Teacher();
		t3.tiching(25000, "c");
	}

}
