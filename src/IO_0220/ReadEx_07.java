package IO_0220;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx_07 {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("C:/Window/system.ini");
			byte[] data = new byte[100];
			int c;
			while((c=reader.read())!=-1) {
				System.out.println((char)c);			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
