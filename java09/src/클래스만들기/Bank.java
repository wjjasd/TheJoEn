package 클래스만들기;

public class Bank {

	public static void main(String[] args) {

		Account acc1 = new Account("튼튼적금", "홍길동");
		Account acc2 = new Account("튼튼예금", "박길동");
		Account acc3 = new Account("다음적금", "홍기사");

		Account[] accounts = { acc1, acc2, acc3 };

		acc1.deposit(1000);
		acc1.withdraw(500);
		System.out.println();
		acc2.deposit(2000);
		System.out.println();
		acc3.deposit(3000);
		System.out.println();

		System.out.println("---------------------");
		System.out.println("고객 계좌 현황");
		System.out.println("---------------------");
		System.out.println("이름\t계좌이름\t잔액");
		for (int i = 0; i < 3; i++) {

			System.out.print(accounts[i].userName + "\t");
			System.out.print(accounts[i].accountName + "\t");
			System.out.print(accounts[i].balance + "\t");

			System.out.println();
		}
		

	}

}
