package Chapter08;

public class InstanceofEx {
	public static void method1(Parentinst parent) {
		if (parent instanceof Childinst) {
			Childinst Child = (Childinst) parent;
			System.out.println("method1-Child�� ��ȯ");
		} else {
			System.out.println("method1-Child�� ����");
		}
	}
	public static void method2(Parentinst parent) {
		Childinst child=(Childinst) parent;
		System.out.println("method2-Child�� ��ȯ");
	} 
	public static void main(String[] args) {
		Parentinst parentA = new Childinst();
		method1(parentA);
		method2(parentA);
		Parentinst parentB = new Parentinst();
		method1(parentB);
		method2(parentB);
	}
}
