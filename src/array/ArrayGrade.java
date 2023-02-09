package array;

public class ArrayGrade {

	public static void main(String[] args) {
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		System.out.println("각 학생의 점수 내용\n");

		for(int i=0;i<gradesArray.length;i++) {
			System.out.printf("Student %2d: %3d\n",i+1,gradesArray[i]);			
				
		}
		int sum=0;
		double avg=0.0;
		for(int grade:gradesArray) {
			sum+=grade;		
		}
		avg = (double)sum/gradesArray.length;
		System.out.printf("평균:%.2f\n" , avg);
		System.out.println();
		//최대점수 최소점수
		int highGrade = gradesArray[0];
		int lowGrade = gradesArray[0];
		for(int grade:gradesArray) {
			if(grade>highGrade) highGrade = grade;
			if(grade<lowGrade) lowGrade = grade;
		}
		System.out.printf("최대점수 :%d\n",highGrade);
		System.out.printf("최소점수 :%d\n",lowGrade);
		
		System.out.println("------점수 분포도------");
		int[] frequency = new int[11];
		// 각 구간에 해당 점수를 처리
		for(int grade:gradesArray)
			++frequency[grade/10]; // frequency[98/10] : 1개 frequency[93/10] :2개 frequency[9]
		for(int count=0;count<frequency.length;count++) {
			if(count == 10)
				System.out.printf("%5d",100);
			else {
				System.out.printf("%02d-%02d",count*10,count*10 +9);
			}
			for(int stars=0;stars<frequency[count];stars++) // frequency[0]...frequency[8]
				System.out.print("*");
			System.out.println();
		}
	}

}
