package 클래스만들기;

public class Account {

	String accountName;
	String userName;
	long balance;

	public Account(String name, String userN) {
		accountName = name;
		userName = userN;
		balance = 0;
	}

	public void deposit(long l) {
		balance += l;
		System.out.println(userName + " 님의 계좌 " + accountName + "에 " + l + "원을 입금했습니다");
		System.out.println("잔액 : " + balance);
	}

	public void withdraw(long l) {
		balance -= l;
		if (balance < 0) {
			System.out.println("잔약이 부족합니다");
		} else {
			System.out.println(userName + " 의 계좌 " + accountName + "에서 " + l + "원을  출금했습니다");
			System.out.println("잔액 : " + balance);
		}
	}
}
