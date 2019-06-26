package p06ParkingLot;

public class J03Bike extends J01Vehicles {
	
	private double rate = 0.5;

	public J03Bike() { }

	public J03Bike(String license, String brand, String model, String color, String spot, double rate) {
		super(license, brand, model, color, spot);
		this.rate = rate;
	}
	
	
	
	
	
	
	

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double pay() {
		return 0;
	}

}
