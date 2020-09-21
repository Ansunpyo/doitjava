package Chapter12;

public class Utill {
	public static <T extends Number> int compare(T t1, T t2) {
		Double v1 = t1.doubleValue();
		Double v2 = t2.doubleValue();
		return Double.compare(v1,  v2);
	}
}
