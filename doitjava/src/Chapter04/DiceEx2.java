package Chapter04;

public class DiceEx2 {

	public static void main(String[] args) {
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);
			switch (dice) {
			case 1:
				dice = '1';
				System.out.println("�ֻ��� ������ 1�Դϴ�");
				break;
			case 2:
				dice = '2';
				System.out.println("�ֻ��� ������ 2�Դϴ�");
				break;
			case 3:
				dice = '3';
				System.out.println("�ֻ��� ������ 3�Դϴ�");
				break;
			case 4:
				dice = '4';
				System.out.println("�ֻ��� ������ 4�Դϴ�");
				break;
			case 5:
				dice = '5';
				System.out.println("�ֻ��� ������ 5�Դϴ�");
				break;
			case 6:
				dice = '6';
				System.out.println("�ֻ��� ������ 6�Դϴ�");
			}
//			
//			if(dice == 1) {
//				System.out.println("�ֻ����� ������ 1�Դϴ�.");
//			} else if(dice == 2) {
//				System.out.println("�ֻ����� ������ 2�Դϴ�.");
//			} else {
//				System.out.println("�ֻ����� ������ 3�Դϴ�.");
//			} 
//		}else {
//			if(dice == 4) {
//				System.out.println("�ֻ����� ������ 4�Դϴ�.");	
//			} else if(dice == 5) {
//				System.out.println("�ֻ����� ������ 5�Դϴ�.");
//			} else {
//				System.out.println("�ֻ����� ������ 6�Դϴ�.");
//			}
//			}
		}
	}


/*
 * Math.tandom()�� ����: 0���� ũ�ų� ���� 1���� ���� ��
 * 
 * 0 <= Math.random() < 1 0 * 6 + 1 <= Math.random() * 6 + 1 < 1 * 6 + 1
 */