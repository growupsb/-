package 네트워크ex01_2027;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[] args) {
		//1. 클라이언트 소켓 선언
		Socket socket = null;
		
		//2. 서버의 ip 주소와 포트를 지정한다.
		try {
			socket = new Socket("localhost",50000);
			System.out.println("클라이언트 연결 성공");
			//3. 서버에 접속
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "Hello, server";
			out.write(str.getBytes());
			
			byte[]arr= new byte[200];
			in.read(arr);
			System.out.println(new String(arr));
			
		} catch (UnknownHostException e) {} 
			catch (IOException e) {}
		finally {
			try {
				socket.close();
			}catch(Exception e) {}
		}
	}
}
