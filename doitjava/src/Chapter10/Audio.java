package Chapter10;

public class Audio implements RemoteControll  {
private int volume = 0;
	
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControll.MAX_VOlUME) {
			this.volume = RemoteControll.MAX_VOlUME;
		} else if (volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}
}
