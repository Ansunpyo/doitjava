package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000;	//��ǻ�ʹ� �����(_)�� �ν����� �ʽ��ϴ�
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
//		bNum = 200; //byte�ڷ����� -128~127������ ��� ����
		/*
		 * �ּ�ó�� �����
		 * control + shift + C
		 * control + /
		 * control + 7
		 */
//		sNum = 40_000; //short�ڷ����� -32768~+32767���� ��� ����
//		iNum = 2_200_000_000 //int�ڷ����� -2,147,483,648~+2,147,483,647���� ��� ����
		System.out.println(1_000_000_000); //10�� ���
		System.out.println(3_000_000_000l); //30�� ���
	}

}