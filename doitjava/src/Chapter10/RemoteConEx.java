package Chapter10;

public class RemoteConEx {

	public static void main(String[] args) {
		RemoteControll rc;
		rc = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume < RemoteControll.MIN_VOLUME) {
					this.volume = volume; 
				} else if(volume > RemoteControll.MAX_VOlUME) {
					this.volume = volume;
				} else {
					this.volume = volume;
				}
				System.out.println("���� ������ ���� " + this.volume + "�Դϴ�.");
				}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
