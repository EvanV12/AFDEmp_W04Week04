package p02CellPhones;

public class J03NonAndroid extends J01Phone {

	public J03NonAndroid() {}

	public J03NonAndroid(String s) {
		super(s);
	}
	
	
	
	@Override
	public void setPrice() {
		super.price = 37.99;
	}
	
	public String toString() {
		return new String("NonAndroid Phone: " + getBrand() + " " + getPrice());
	}
	
}
