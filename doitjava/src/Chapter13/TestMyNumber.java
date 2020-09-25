package Chapter13;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber max = (x,y) -> (x >= y) ? x : y;
//		System.out.println(max.getMax(10, 20));
		
		int num1 = 10;
		int num2 = 20;
		
		MyNumber in = new ImpleNumber();
		int result = in.getMax(num1, num2);
		System.out.println("in1: " + result);
		
		MyNumber in2 = new MyNumber() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2: " + result);
		
		MyNumber in3 = (x, y) -> { return x >= y ? x : y; };
		result = in3.getMax(num1, num2);
		System.out.println("in3: " + result);
	}
}
