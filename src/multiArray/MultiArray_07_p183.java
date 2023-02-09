package multiArray;

public class MultiArray_07_p183 {
	public static void main(String[] args) {
		int[][] englishScores = new int[2][]; // 길이가 다름. 열 생략
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0;i<englishScores.length;i++) { // 2차원 배열의 전체 길이. 행
			for(int j=0;j<englishScores[i].length;j++) { // 열
				
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
			}
		}
		System.out.println();
		
		englishScores[0][0]=90;
		englishScores[0][1]=91;
		englishScores[1][0]=92;
		englishScores[1][1]=93;
		englishScores[1][2]=94;
		
		int totalStudent = 0; 
		int totalEnglishSum = 0;
		
		
		for(int i=0;i<englishScores.length;i++) { 
			totalStudent+=englishScores[i].length;
			for(int j=0;j<englishScores[i].length;j++) {
				
				totalEnglishSum+=englishScores[i][j];
			}
		}
		double avg = (double)totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수 : " + avg);
	}
}
