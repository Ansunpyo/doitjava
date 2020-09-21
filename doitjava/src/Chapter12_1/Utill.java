package Chapter12_1;

public class Utill {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCampare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCampare;
	}
}
