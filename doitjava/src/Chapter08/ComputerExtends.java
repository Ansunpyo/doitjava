package Chapter08;

public class ComputerExtends extends CalculatorEdtends {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
	}
}