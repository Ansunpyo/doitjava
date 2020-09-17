package Chapter10;

public class RemoteConEx {

	public static void main(String[] args) {
		RemoteControll rc;
		rc = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("전등을 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전등을 끕니다");
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
				System.out.println("현재 전등의 밝기는 " + this.volume + "입니다.");
				}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
