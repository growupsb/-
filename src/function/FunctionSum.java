//package function;
//
//import util.DataType;
//
//public class FunctionSum {
//	public static void main(String[] args) {
//		// int n = 100
//		// sum()
//		// 메소드를 이용해 1 ~ 100 합 구하기
//		System.out.println("값을 입력하세요 : ");
//		int n = DataType.inputInt(); 
//		int t = sum(n); // 아래 메소드 작성하여 이 sum으로 가져오기
//		//평균
//		avg = average(t)
//		//sum(n)/5; => int avg = tot/5;
//		//System.out.println("평균 : " + avg);
//	}
//	public static void sum(int n) {
//		int tot = 0;
//		for(int i=0;i<=n;i++)
//			tot +=i;
//		System.out.printf("합 : %5d\n",tot);
//		// 다른 수식에 참여한다면 return 사용
//		// 만약 위에서 평균을 구하려면 sum을 사용해야 함. 이럴 때  void sum을 int sum으로 바꾸고 return tot;을 사용
//		// 여기선 다른 수식 참여가 없기에 return 사용하지 않음
//	}
//	public static int average(int t) { // return하려면 int로 바꾸어줌
//		return t/5;
//	}
//}
