package Chapter08;

public class ComputerExtendsEx {

	public static void main(String[] args) {
		int r = 10;
		
		CalculatorEdtends calc = new CalculatorEdtends();
		System.out.println("원면적: " + calc.areaCircle(r));
		System.out.println();
		
		CalculatorEdtends com = new CalculatorEdtends();
		System.out.println("원면적: " + com.areaCircle(r));
	}

}
