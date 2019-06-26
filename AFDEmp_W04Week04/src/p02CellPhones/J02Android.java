package p02CellPhones;

public class J02Android extends J01Phone {

	public J02Android() {}
	
	public J02Android(String s) {
		super(s);
	}

	
	
	@Override
	public void setPrice() {
		super.price = 24.99;
	}
	
	public String toString() {
		return new String("Android Phone: " + getBrand() + " " + getPrice());
	}
	

}

