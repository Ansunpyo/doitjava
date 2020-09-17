package Chapter10;

public class Audio implements RemoteControll  {
private int volume = 0;
	
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}
	
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControll.MAX_VOlUME) {
			this.volume = RemoteControll.MAX_VOlUME;
		} else if (volume < RemoteControll.MIN_VOLUME) {
			this.volume = RemoteControll.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç Audio º¼·ý: " + this.volume);
	}
}
