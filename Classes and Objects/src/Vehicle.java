
public class Vehicle {
	private int maxSpeed;
	private int wheels;
	private String color;
	private double fuelCapacity;  

	public void horn() {
		System.out.println("Beep!");
	}  
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	Vehicle(){
		setColor("Red");
	}
}
