package Chapter04;

public class DiceEx2 {

	public static void main(String[] args) {
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);
			switch (dice) {
			case 1:
				dice = '1';
				System.out.println("주사위 눈금은 1입니다");
				break;
			case 2:
				dice = '2';
				System.out.println("주사위 눈금은 2입니다");
				break;
			case 3:
				dice = '3';
				System.out.println("주사위 눈금은 3입니다");
				break;
			case 4:
				dice = '4';
				System.out.println("주사위 눈금은 4입니다");
				break;
			case 5:
				dice = '5';
				System.out.println("주사위 눈금은 5입니다");
				break;
			case 6:
				dice = '6';
				System.out.println("주사위 눈금은 6입니다");
			}
//			
//			if(dice == 1) {
//				System.out.println("주사위의 눈금은 1입니다.");
//			} else if(dice == 2) {
//				System.out.println("주사위의 눈금은 2입니다.");
//			} else {
//				System.out.println("주사위의 눈금은 3입니다.");
//			} 
//		}else {
//			if(dice == 4) {
//				System.out.println("주사위의 눈금은 4입니다.");	
//			} else if(dice == 5) {
//				System.out.println("주사위의 눈금은 5입니다.");
//			} else {
//				System.out.println("주사위의 눈금은 6입니다.");
//			}
//			}
		}
	}


/*
 * Math.tandom()의 범위: 0보다 크거나 같고 1조다 작은 수
 * 
 * 0 <= Math.random() < 1 0 * 6 + 1 <= Math.random() * 6 + 1 < 1 * 6 + 1
 */