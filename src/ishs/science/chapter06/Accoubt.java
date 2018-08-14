package ishs.science.chapter06;

public class Accoubt {
	String Name;
	String accNo;
	int balance;
	
	void deposite(int money) {
		balance += money;//balance = balance + money
	}
	
	void withdraw(int money) {
		balance -= money;//balance = balance - money
	}
	
	void checkbalance() {
		System.out.println("예금주:" + Name);
		System.out.println("계좌번호:" + accNo);
		System.out.println("잔액:" + balance);
	}

}
