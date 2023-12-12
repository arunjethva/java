package oops_Concept;
class pen
{
	int prize;
	String colour;
	String comepny;
	
	public void towrite() {
		System.out.println(prize+" "+colour+" "+comepny);
	}
	
}

public class First_class_pbject {
	public static void main(String args[]) {
		
		pen p1 = new pen();
		p1.prize = 35;
		p1.colour= "blue";
		p1.comepny = "cello";
		p1.towrite();
		
		pen p2 = new pen();
		p2.prize = 123;
		p2.colour= "red";
		p2.comepny = "gel";
		p2.towrite();
	}
}
