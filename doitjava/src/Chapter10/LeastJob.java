package Chapter10;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToagent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}

}
