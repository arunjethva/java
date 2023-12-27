package corejava_assignments;

abstract class Bank {
	public abstract void getBalance();
}

class Bank1 extends Bank {
	public void getBalance() {
		System.out.println("Bank1 Deposited $100");
	}

}

class Bank2 extends Bank {
	public void getBalance() {
		System.out.println("Bank2  Deposited $150");
	}
}

class Bank3 extends Bank {
	public void getBalance() {
		System.out.println("Bank3 Deposited $200");
	}
}

public class O30_coreJava_bank {
	public static void main(String[] args) {

		Bank b1 = new Bank1();
		b1.getBalance();
		Bank b2 = new Bank2();
		b2.getBalance();
		Bank b3 = new Bank3();
		b3.getBalance();

	}

}
