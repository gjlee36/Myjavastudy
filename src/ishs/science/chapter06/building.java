package ishs.science.chapter06;

public class building {
	String name;
	String address;
	int totalFloor;
	
	public void moveElevator() {
		System.out.println( "엘리베이터를 운행합니다." );
	}

	
	public void changeAddress( String newAddress ) {
		address = newAddress;
	}
}
