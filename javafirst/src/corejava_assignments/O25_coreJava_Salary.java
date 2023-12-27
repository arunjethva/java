package corejava_assignments;

class Member {
    int id;
	String Name;
	int Age;
	int PhoneNumber;
	String Adress;
	double salary;

	public void printSalary(double salary) {
		this.salary = salary;
		System.out.println("The salary is :" + salary);
	}

}

public class O25_coreJava_Salary {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.printSalary(50000);
	}

}
