package Example;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 50; i++) {
			sum += i;

		}
		double res = sum / 50.0;
		System.out.println(res);
	}

}