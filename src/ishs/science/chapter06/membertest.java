package ishs.science.chapter06;

public class membertest {
	
	public static void main(String[] args) {
		member m1 = new member();
		m1.name ="ȫ�浿";
		m1.password= "1234";
		m1.mileage = 5000;
		m1.makeReserve();
		if(m1.enterEvent()) {
			System.out.println("�̺�Ʈ ���� ����");
		}else {
			System.out.println("�̺�Ʈ ���� ����");
		}
		
		
	}

}
