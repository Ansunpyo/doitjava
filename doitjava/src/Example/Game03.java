package Example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		//���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		//switch case ������ ����ؾ� �մϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �˰� �����ʴϱ�?");
		int thisMon = sc.nextInt();
		int day = 0;
		
		switch (thisMon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			System.out.println(thisMon + "���� " + day + "�ϱ����Դϴ�.");
			break;
		case 2:
			day = 29;
			System.out.println(thisMon + "���� " + day + "�ϱ����Դϴ�.");
			break;
		default:
			day = 30;
			System.out.println(thisMon + "���� " + day + "�ϱ����Դϴ�.");
			break;
	}

}
	
}
