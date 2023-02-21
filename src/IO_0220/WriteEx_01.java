package IO_0220;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx_01 {
	public static void main(String[] args) {
		OutputStream os = null ;
		try {
			//현재 파일이 open상태
			os  = new FileOutputStream("c:/Temp/test2.db"); //OutputStream은 추상 클래스. 추상 클래스는 상속해야 함
			/*byte a = 10;
			byte b = 20;
			byte c = 30; 
			
			os.write(a);
			os.write(b);
			os.write(c);*/
			/*byte[] array = {10,20,30};
			os.write(array);*/
			byte[]array = {10,20,30,40,50};
			os.write(array,1,3);
			
			os.flush();
			//os.close();
			System.out.println("파일에 저장됨");
		} catch (IOException e) {
			//System.out.println("예외 : " + e.getMessage());
			e.printStackTrace();
		}/*finally {
			try {
			os.close();
			}catch(IOException e) {
			e.printStackTrace();
			}*/
	
		}
		
}

