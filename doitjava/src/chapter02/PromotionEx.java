package chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
				System.out.println("���� �����ڵ� :" + intValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue;
		
		long longValue = 100000L;
		long res2 = intValue + longValue;
	}

}