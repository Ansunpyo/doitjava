package Chapter10;

public interface RemoteControll {
	public int MAX_VOlUME = 10;
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 상태로 설정합니다.");
		} else {
			System.out.println("음소거 상태를 해제합니다.");

		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");

	}

}