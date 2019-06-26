package p06ParkingLot;

public class J02Car extends J01Vehicles implements Payable{
	
	private double rate = 2;

	// default constructor
	public J02Car() { }

	// constructor
	public J02Car(String licensePlate, String brand, String model, String color, String parkingSpot, double rate) {
		super(licensePlate, brand, model, color, parkingSpot);
		//this.rate = rate;
	}

		
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	@Override
	public String toString() {
		return "Car [rate =" + rate + "License plate = " + getLicensePlate() + "]";
	}

	public double pay() {
		return 0;
	}
		
	
}

/*
if(choice.equals("2")) {
	Vehicles v1 = new Cars();
	 System.out.println("Give me your license plate: ");
	 v1.setLplate(sc.next());
     System.out.println("Give me your brand: ");
     v1.setBrand(sc.next());
     System.out.println("Give me your model: ");
     v1.setModel(sc.next());
     System.out.println("Give me your color: ");
     v1.setColor(sc.next());
     v1.setParkSpot();
     v1.setEntranceTime(	
}*/
