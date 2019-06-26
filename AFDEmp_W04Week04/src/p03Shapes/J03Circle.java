package p03Shapes;

public class J03Circle extends J02Shapes {

	
	public static final double pi=3.14;
	private J01Point a;
	private int radius;
	
	
	
	
	public J03Circle() {}						//default constructor
	
	public J03Circle (J01Point a, int radius){	// constructor
		this.a = a;
		this.radius = radius;
	}
	
	
	public J03Circle (J01Point p [], int radius){		// constructor
		super.getP();
		super.setN(1);
		this.radius = radius;
	}
	
	
	
	public J01Point getA() {
		return a;
	}
	public void setA(J01Point a) {
		this.a = a;
	}
	
	
	public int getRadius () {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	public void getPerimeter() {
		double perimeter = 2*pi*radius;
		System.out.println("Circumference of the circle is: " + perimeter);
	}
	
	public void getArea() {
		double area = pi*radius*radius;
		System.out.println("Surface Area of the circle is: " + area);
	}
	
}
	
