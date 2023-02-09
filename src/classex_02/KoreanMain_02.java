package classex_02;

public class KoreanMain_02 {
	public static void main(String[] args) {
		Korean kor = new Korean(); // 기본 생성자 메소드는 객체를 초기화한다. 있어도 없어도 됨.
		System.out.println(kor); // 기본 생성자 메소드를 출력하면 null이 출력됨
		Korean kor1 = new Korean("java", "12345");
		System.out.println(kor1.toString()); //toString은 최상위 클래스인 object가 갖고 있다. 
		//모든 클래스는 Object 클래스를 부모클래스로 자동 상속받아서 사용하게 된다.
		//그렇기에 아래 출력값은 toString을 사용하지 않아도 출력 가능함.
		
		Korean kor2 = new Korean("자바","98765");
		System.out.println("kor2.국가 : " + kor2.nation);
		System.out.println("kor2.이름 : " + kor2.name);
		System.out.println("kor2.주민번호 : " + kor2.ssn);
	}
}
