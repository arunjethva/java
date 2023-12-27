package corejava_assignments;

public class O18_coreJava_startString {

	public static void main(String[] args) {
		String str1 = "Red is my favorite color.";
		String str2 = "Orange is also my favorite color ";

		String start = "Red";

		boolean start1 = str1.startsWith(start);
		boolean start2 = str2.startsWith(start);

		System.out.println(str1 + "start with " + start + " ? " + start1);
		System.out.println(str2 + "start with " + start + " ? " + start2);

	}

}
