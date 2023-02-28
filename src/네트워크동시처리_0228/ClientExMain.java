package 네트워크동시처리_0228;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientExMain {
	public static void main(String[] args) {
		//Socket socket = new Socket("127.0.0.1",60000);
		try {
			Socket socket = new Socket("localhost",60001);
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "나는 자바가 좋아";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
			
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (IOException e) {}
	}
}
