package ishs.science.chapter06;

public class membertest {
	
	public static void main(String[] args) {
		member m1 = new member();
		m1.name ="홍길동";
		m1.password= "1234";
		m1.mileage = 5000;
		m1.makeReserve();
		if(m1.enterEvent()) {
			System.out.println("이벤트 참여 성공");
		}else {
			System.out.println("이벤트 참여 실패");
		}
		
		
	}

}
