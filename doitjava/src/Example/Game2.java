package Example;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int com = (int) (Math.random() * 100) + 1;
		int user = 0;
		int cnt = 0;

		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1~100 �߿� �����ϰ� ������ ���ڸ� ���� �ּ���.");

		while (true) {
			System.out.println("> ");
			user = sc.nextInt();
			System.out.println(++cnt + "ȸ �Է��ϼ̽��ϴ�");
			if (user > com) {
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�");
			} else if (user < com) {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�");
			} else {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				sc.close();
				break;
			}
		}

	}

}
