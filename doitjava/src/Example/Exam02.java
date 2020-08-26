package Example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("짝수입니다");
		}
		if (num1 % 2 == 1) {
			System.out.println("홀수입니다");
		}
		
			System.out.println(num1 % 2 == 0? "짝수2" : "홀수2");
		sc.close();

	}
}
