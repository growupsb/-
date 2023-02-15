package exception.user;

public class Account {
	private long balance;
	
	public Account() {}// 생성자 메소드

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException{
		if(balance<money)
			//System.out.println("잔고 부족");
			throw new InsufficientException("잔고 부족 : " + (money-balance) + "모자람"); //withdraw 호출에서 잔고 부족을 알림
		balance = money;
	}
}
