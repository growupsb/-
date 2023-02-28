package 네트워크ex01_2027;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExMain {
	public static void main(String[] args) {
		//1. 서버 소켓 선언
		ServerSocket serverSocket = null;
		Socket socket = null;
		//2. 서버에 포트번호를 지정한다.
		try {
			serverSocket = new ServerSocket(50000);
			System.out.println("[서버 시작]");
			System.out.println("[서버] 연결 요청 기다림\n");
			serverSocket.accept();
			//클라이언트가 접속하면 서버와 데이터 입출력 발생
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte[] arr = new byte[200];
			in.read(arr);
			System.out.println(new String(arr));
			
			String str = "Hello, Client";
			out.write(str.getBytes());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {}
		}
	}
}
