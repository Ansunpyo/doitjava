package Chapter03;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;  //Cammel��� ���
		int motherAge = 47;  //Cammel��� ���
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		isEven = num % 2 == 0 ? true : false;
		System.out.println("¦���ΰ���? " + isEven);
	}

}