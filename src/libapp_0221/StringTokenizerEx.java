package libapp_0221;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[]arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token); //분리
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
