package Chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������
 * ����غ�����.
 */
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�");
		}
		sc.close();
	}

}