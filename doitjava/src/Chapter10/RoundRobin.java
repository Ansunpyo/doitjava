package Chapter10;

public class RoundRobin implements Scheduler {

	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�");
	}

	public void sendCallToagent() {
		System.out.println("��� ���� �������� ����մϴ�");
	}
	
}
