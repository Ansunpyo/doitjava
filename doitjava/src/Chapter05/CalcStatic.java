package Chapter05;

public class CalcStatic {

	public static void main(String[] args) {
		CalcStatic calc = new CalcStatic();
		int res1 = CalcStaitc.plus(10, 20);
		System.out.println(res1);
		int res2 = calc.plus(10, 5);
		System.out.println(res2);
		int res3 = 
				
		
				
		calc.num1 = 20;
		calc2.num1 = 200;
		System.out.println(calc.num1);
		System.out.println(calc2.num1);
		
		System.out.println(calc.num2);
		System.out.println(calc2.num2);
		
		calc.num2 = 30;
		System.out.println(calc.num2);
		
		calc2.num2 = 300;
		System.out.println(calc.num2);
		
		System.out.println(calc.num2);	
	}

}
