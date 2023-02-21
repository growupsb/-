package IO_0220;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataStreamEx_10 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Temp/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		Scanner sc = null;
		double sum = 0.0;
		dos.writeDouble(92.6);
		dos.writeDouble(123.45);
		
		dos.flush();
		
		sc = new Scanner(new BufferedReader(new FileReader("C:/Temp/data.txt")));
		while(sc.hasNext()) {
			if(sc.hasNextDouble()) {
				sum+=sc.nextDouble();
			}else {
				sc.next();
			}
		}
		if(sc!=null) sc.close();
		
		dos.close();
		fos.close();
		

		System.out.println(sum);
	}
}
