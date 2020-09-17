package Chapter10;

public class Television2 implements RemoteControll  {
private int volume = 0;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControll.MAX_VOlUME) {
			this.volume = RemoteControll.MAX_VOlUME;
		} else if (volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý: " + this.volume);
	}
}
