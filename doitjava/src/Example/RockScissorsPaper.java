package Example;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		final int Ga = 0;
		final int Ba = 1;
		final int Bo = 2;

		int user, com;
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);

		System.out.println("���������� �����Դϴ�.");
		while (true) {
			com = (int) (Math.random() * 3);
			System.out.println("0: ����, 1: ����, 2: ��");
			System.out.println("> ");
			user = sc.nextInt();

			/* ����� ��� */
			System.out.println("��ǻ��: " + (com == 0 ? "����" : (com == 1 ? "����" : "��")));
			System.out.println("����: " + (user == 0 ? "����" : (com == 1 ? "����" : "��")));
			if ((com == Ga && user == Ba) || (com == Ba && user == Bo) || (com == Bo && user == Ga)) {
				System.out.println("���� ��");
				score += 100;
			} else if (com == user) {
				System.out.println("���");
				score += 10;
			} else {
				System.out.println("��ǻ�� ��");
			}
			life--;

			System.out.println("���� ���� : " + score);
			System.out.println("���� ������ : " + life);

			if (life == 0) {
				System.out.println("�������� 0�̶� ������ �����մϴ�.");
				sc.close();
				break;
			}

		}
	}

}