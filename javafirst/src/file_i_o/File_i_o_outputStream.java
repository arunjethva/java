package file_i_o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_i_o_outputStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		try {
			
			System.out.println("Enter the name ");
			String name = sc.nextLine();
			
			fos = new FileOutputStream("G:\\output\\"+name);
			

			System.out.println("Enter the Email");
			String email = sc.nextLine();
			
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println();
			
			byte b1[]=email.getBytes();
			fos.write(b1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}
}
