package Chapter09;

public class SuperLevel extends PlayerLevel {
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}
	
	public void jump() {
		System.out.println("���� ���� jump�մϴ�.");
	}
	
	public void turn() {
		System.out.println("�� ���� ���ϴ�");
	}
	
	public void showLevelMessage() {
		System.out.println("***** ������ �����Դϴ�. ******");
	}
}