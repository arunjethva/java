package new_Exeption;

public class O02_Exeption2 extends O01_Exeption1 {
	int achake;

	public O02_Exeption2(int achake) {
		this.achake = achake;

	}

	public void getmessage() {
		System.out.println("you are under 18. you can't vote ");
	}
}
