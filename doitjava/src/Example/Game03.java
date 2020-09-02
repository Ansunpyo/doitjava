package Example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램을 작성하세요.
		//switch case 구문을 사용해야 합니다
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월을 알고 싶으십니까?");
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
			System.out.println(thisMon + "월은 " + day + "일까지입니다.");
			break;
		case 2:
			day = 29;
			System.out.println(thisMon + "월은 " + day + "일까지입니다.");
			break;
		default:
			day = 30;
			System.out.println(thisMon + "월은 " + day + "일까지입니다.");
			break;
	}

}
	
}
