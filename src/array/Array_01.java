package array;

public class Array_01 {
	public static void main(String[] args) {
		int[] num = new int[2];
		int[] num1 = {11,22,33,44,55};
		int[] num2 = {100,200,300,400,500};
		int[] num3 = new int[5];
		
		char[] ch;
		ch = new char[5];
		
		System.out.println("num[0]=" + num[0]);
		System.out.println("num[1]=" + num[1]);
		
		num[0] = 100;
		num[1] = 200;
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		ch[4] = 'e';
		for(int i=0;i<ch.length;i++)
			ch[i]=(char)('f'+i);
		
		System.out.println("num[0]=" + num[0]);
		System.out.println("num[1]=" + num[1]);
		
		num3[0] = num1[0]+num2[0];
		
		System.out.println(num3[0]);
		
		int len = num.length;
		for(int i = 0; i<len; i++)
			System.out.println("num["+i+"]="+num[i]); // 반복문 쓰는 것이 편함
		
		
		for(int i = 0; i<ch.length;i++) {
			System.out.println("ch["+i+"]="+ch[i]);
		}
	}
}
