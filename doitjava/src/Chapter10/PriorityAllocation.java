package Chapter10;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ������ ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToagent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}

}