package Chapter10;

public class SmartTelevision {
	public int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControll.MAX_VOlUME) {
			this.volume = RemoteControll.MAX_VOlUME;
		} else  if(volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + volume);
	}
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
