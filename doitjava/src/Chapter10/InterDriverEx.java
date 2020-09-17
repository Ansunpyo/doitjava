package Chapter10;

public class InterDriverEx {

	public static void main(String[] args) {
		InterDriver driver = new InterDriver();
		
		InterBus bus = new InterBus();
		InterTaxi taxi = new InterTaxi();
		
		driver.driver(bus);
		driver.driver(taxi);
	}

}
