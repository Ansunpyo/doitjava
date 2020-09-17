package Chapter10;

public class RemoteControllEx {
	private static void main(String[] args) {
		RemoteControll rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControll.changeBattery();
	}
} 