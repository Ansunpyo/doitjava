package Example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		if (num1 % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}
		
			System.out.println(num1 % 2 == 0? "¦��2" : "Ȧ��2");
		sc.close();

	}
}
