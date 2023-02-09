package phoneNumber;
/*
 compareTo() 함수
 A.compareTo(B)는 문자열, 숫자 등 두개의 객체 A와 B의 크기를 비교하는 함수이다.
 
 A.compareTo(B)의 결과 값으로 0, 양수, 음수가 리턴될 수 있으며,아래와 같다.
 0 : A와 B가 같다.    	   a==b
 음수 : A가 B보다 작다.    a<b
 양수 : A가 B보다 크다.    a>b
 */
public class CompareTo {
	public static void main(String[] args) {
		 String str1="Hello";
		 String str2="Hello";
		 String str3="World";
		 String str4="Java";

		 Integer num1=100;
		 Integer num2=200;
		 Integer num3=100;
		 Integer num4=50;
		 
		 System.out.println("str1.compareTo(str2) : "+str1.compareTo(str2));
		 System.out.println("str1.compareTo(str3) : "+str1.compareTo(str3));
		 System.out.println("str1.compareTo(str4) : "+str1.compareTo(str4));
		 System.out.println("str3.compareTo(str4) : "+str3.compareTo(str4));

		 System.out.println("num1.compareTo(num2) : "+num1.compareTo(num2));
		 System.out.println("num1.compareTo(num3) : "+num1.compareTo(num3));
		 System.out.println("num3.compareTo(num4) : "+num3.compareTo(num4));
		 
	}
}
