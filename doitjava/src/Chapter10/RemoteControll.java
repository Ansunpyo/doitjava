package Chapter10;

public interface RemoteControll {
	public int MAX_VOlUME = 10;
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���Ұ� ���·� �����մϴ�.");
		} else {
			System.out.println("���Ұ� ���¸� �����մϴ�.");

		}
	}

	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");

	}

}