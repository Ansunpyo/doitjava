package Chapter08;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ¼ö¸í: " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("****" + location + "Tire ÆãÅ© ****");
			return false;
		}
	}
}
