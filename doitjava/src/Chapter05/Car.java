package Chapter05;

public class Car {
	private String model;
	private String color;
	private int gear;
	private int speed;
	private int maxSpeed;
	
	void info() {
		System.out.println(model + ", " + color);
	}
	
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpped(int spped) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
