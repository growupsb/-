package exception.user;

public class AccountMenu {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.deposit(10000); //값은 getBalance에 저장된다. 예금액 : 10000
		System.out.println("예금액 : " + ac.getBalance());
		
		try {
			ac.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		

	}

}
