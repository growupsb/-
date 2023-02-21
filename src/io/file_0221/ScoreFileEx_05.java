package io.file_0221;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ScoreFileEx_05 {
	public static void main(String[] args) {		
		//socre.txt 파일에 있는 점수 읽어오고 총점, 인원, 평균 구하기
		int totalScore = 0;
		int count = 0;
		float avg = 0.0f;
		File file = new File("C:/java/work/score.txt");
		String s = "";		
		
		//파일에 있는 데이터 읽어오기. 입출력 사용
			try {
				BufferedReader in = new BufferedReader(new FileReader(file));
				s = in.readLine();
				if(s !=null) {
					System.out.println("시험 점수 : " + s);
					StringTokenizer st = new StringTokenizer(s, ",");
					while(st.hasMoreTokens()) {
						totalScore += Integer.parseInt(st.nextToken());
						count++;
					}
				}
				System.out.println("총점 : " + totalScore);
				System.out.println("시험 본 사람 : " + count);
				
				avg = (float)totalScore/count;
				System.out.println("시험 평균 : " + avg);
				in.close();
			} catch (FileNotFoundException e) {
				System.out.println("파일이 해당 경로에 존재하지 않습니다.");
			} catch (IOException e) {
				System.out.println("파일 입출력 오류" + e.getMessage());
			}
//			System.out.println("시험점수 : " + in.readLine());
//			
//			String data = in.readLine();
//			StringTokenizer st = new StringTokenizer(data, ",");
//			while(st.hasMoreTokens()) {
//				String token = st.nextToken();
//				System.out.println(token);
//			}
//			System.out.println("총점 : " );
//			System.out.println("시험 본 사람 : ");
//			System.out.println("시험 평균 : ");
//		

	}
}
