package file_i_o;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_i_o_InputStream {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FileInputStream fis = null;

		System.out.println("Enter the file name");
		String name = sc.next();

		try {
			fis = new FileInputStream("G:\\output\\"+name);
			int f = fis.read();

			while (f != -1) {
				char ch = (char) f;
				System.out.print(ch);
				f = fis.read();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
