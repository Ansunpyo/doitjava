package Chapter10;

public class Television2 implements RemoteControll  {
private int volume = 0;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControll.MAX_VOlUME) {
			this.volume = RemoteControll.MAX_VOlUME;
		} else if (volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
}
