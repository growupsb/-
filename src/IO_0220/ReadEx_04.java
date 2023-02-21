package IO_0220;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx_04 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Windows/system.ini");
			byte[] data = new byte[120];
			int n = 0, num;
			while((num=is.read())!=-1) {
				//읽은 정수형 바이트에 저장 --> 바이트에 맞게 형 변환
				//변환된 값을 배열에 저장
				//int num = is.read(data);
				//if(num==-1) break;
				data[n] = (byte)num;
				n++;
			}
			System.out.println("C:/windows/system.ini 출력");
			for(int i=0;i<data.length;i++)
				System.out.print(data[i]+" ");
			System.out.println();
			is.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
