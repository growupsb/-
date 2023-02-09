package phoneNumber;

public class ComparetoTtest {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "World";
		String str4 = "Java";
		
		Integer num1 = 100;
		Integer num2 = 200;
		Integer num3 = 100;
		Integer num4 = 50;
		
		System.out.println("str1.compareTo(str2)) : " + str1.compareTo(str2));  //str1과 str2 비교
		System.out.println("str1.compareTo(str3)) : " + str1.compareTo(str3)); // str1과 str3 비교
		System.out.println("str3.compareTo(str4)) : " + str3.compareTo(str4));
		
		System.out.println("num1.compareTo(num2) : " + num1.compareTo(num2)); // num1의 100과 num2의 200 비교.  num1<num2의 결과는 음수값 출력
		System.out.println("num1.compareTo(num3) : " + num1.compareTo(num3)); 
		System.out.println("num3.compareTo(num4) : " + num3.compareTo(num4)); 
	}
}
