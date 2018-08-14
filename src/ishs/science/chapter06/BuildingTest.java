package ishs.science.chapter06;

public class BuildingTest {
	
	public static void main(String[] args) {
		building kimpo = new Building();
		kimpo.name = "국제선타워";
		kimpo.address = "김포동";
		kimpo.totalFloor = S;
		
		kimpo.moveElevator();
		System.out.println(kimpo.address);
		kimpo.changeAddress("운서동");
		System.out.println(kimpo.address)
	}

}
