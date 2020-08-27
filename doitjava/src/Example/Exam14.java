package Example;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?: ");
		int Line = sc.nextInt();
		int upLine = Line / 2;
		int downLine = Line - upLine;

		for (int i = 0; i < upLine; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = downLine - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

		}

	}
	
}
