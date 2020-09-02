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

		System.out.println("가위바위보 게임입니다.");
		while (true) {
			com = (int) (Math.random() * 3);
			System.out.println("0: 가위, 1: 바위, 2: 보");
			System.out.println("> ");
			user = sc.nextInt();

			/* 결과값 출력 */
			System.out.println("컴퓨터: " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.println("유저: " + (user == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			if ((com == Ga && user == Ba) || (com == Ba && user == Bo) || (com == Bo && user == Ga)) {
				System.out.println("유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println("비김");
				score += 10;
			} else {
				System.out.println("컴퓨터 승");
			}
			life--;

			System.out.println("현재 점수 : " + score);
			System.out.println("남은 라이프 : " + life);

			if (life == 0) {
				System.out.println("라이프가 0이라서 게임을 종료합니다.");
				sc.close();
				break;
			}

		}
	}

}