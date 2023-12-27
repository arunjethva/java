package exeption;

public class O01_Exeption {
	public static void main(String[] args) {
		
		char bg[]= {'a','b','c','d','f','g','h','i','j','k'};
		
		System.out.println(bg[0]);
		try {
		System.out.println(bg[10]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally{
		System.out.println(bg[5]);
		
		}
	}
}
