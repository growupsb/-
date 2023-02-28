package udt_0227;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	
	public static void main(String[] args) {
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
		
		//UDP 서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		stopServer();//TCP 서버 종료
	}
	
	private static void startServer() {
		Thread thread = new Thread() {
			public void run() {
				try {
					datagramSocket = new DatagramSocket(60000);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
						datagramSocket.receive(receivePacket);
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
						
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						
						for(int i=1;i<=10;i++) {
							String data = newsKind + ": 뉴스 " + i;
							byte[] bytes = data.getBytes("UTF-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						}
					}
				}	catch (Exception e) {
				System.out.println("[서버] " + e.getMessage());
			}
		}
	};
	thread.start();
	}

	private static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}

	
}
