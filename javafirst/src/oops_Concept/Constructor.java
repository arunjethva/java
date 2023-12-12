package oops_Concept;

class Student {
	int age;
	String name;

	Student() {
		System.out.println(" constructror clling.......");
	}

	Student(int age)// in Constructor you give any name you want whatever
	{
		System.out.println(" The  Age is :" + " " + age);
	}

	Student(String name) {
		System.out.println(" The  name is : " + " " + name);
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void view() {
		System.out.println(age + " " + name);
	}
}

public class Constructor {
	public static void main(String args[]) {
//
//		Student st = new Student();
//		Student st1 = new Student(21);
//		Student st2 = new Student("ARUN JETHVA");

		Student st = new Student(20,"ARUN");
		st.view();

		Student st1 = new Student(22 ,"DEVAMG");
		st1.view();

	}
}