package Chapter03;

public class CompareOperator {

	public static void main(String[] args) {
			int num1 = 10, num2 = 10;
			
			boolean res1 = (num1 == num2);
			boolean res2 = (num1 != num2);
			boolean res3 = (num1 <= num2);
			System.out.println("res1 = " + res1);
			System.out.println("res2 = " + res2);
			System.out.println("res3 = " + res3);
			
			char char1 ='A', char2 = 'B';  //A�� 65, B�� 66�̴�
			boolean res4 = (char1 < char2);
			System.out.println("res4 = " + res4);
	}

}
