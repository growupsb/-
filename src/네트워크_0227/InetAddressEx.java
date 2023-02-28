package 네트워크_0227;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
			
			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : arr)
				System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
		} catch (UnknownHostException e) {}
		
	}
}
