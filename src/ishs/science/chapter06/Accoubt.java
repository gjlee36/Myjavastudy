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
		System.out.println("������:" + Name);
		System.out.println("���¹�ȣ:" + accNo);
		System.out.println("�ܾ�:" + balance);
	}

}
