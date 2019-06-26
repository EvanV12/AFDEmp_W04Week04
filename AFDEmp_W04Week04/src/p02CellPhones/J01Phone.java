package p02CellPhones;

public abstract class J01Phone {
	private String brand;
	protected double price;

	public J01Phone() {}
	
	public J01Phone (String b) {
		brand = b;
	}

	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

	public abstract void setPrice();
	
	//public String toString() {
	//	return new String("NonAndroid Phone: " + getBrand() + " " + getPrice());
	//}
	
}
