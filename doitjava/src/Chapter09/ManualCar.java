package Chapter09;

public class ManualCar extends Car {
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들로 조작합니다");
	}
	
	public void stop() {
		System.out.println("브레이크로 정지합니다");
	}

}
