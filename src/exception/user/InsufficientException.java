package exception.user;

public class InsufficientException extends Exception{ // 일반 예외 선언
	public InsufficientException() {} // 기본 생성자 함수
	
	public InsufficientException(String message) { // 잔고 부족
		super(message);
	}
}
