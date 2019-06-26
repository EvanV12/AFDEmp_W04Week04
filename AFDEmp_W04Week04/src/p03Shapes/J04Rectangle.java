package p03Shapes;

public class J04Rectangle extends J02Shapes {
	private J01Point a;  			 //η μεταβλητη Point ειναι συνθετου τυπου (πχ οχι int,string), την ορισαμε εμεις
	private J01Point b;
	private J01Point c;
	private J01Point d;
	
	
	public J04Rectangle() {}		//constructor (default)
	
	public J04Rectangle(J01Point a, J01Point b, J01Point c, J01Point d) {		//also constructor
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	public J01Point getA() {
		return a;
	}
	public void setA(J01Point a) {
		this.a = a;
	}
	
	
	public J01Point getB() {
		return b;
	}
	public void setB(J01Point b) {
		this.b = b;
	}
	
	
	public J01Point getC() {
		return c;
	}
	public void setC(J01Point c) {
		this.c = c;
	}
	
	
	public J01Point getD() {
		return d;
	}
	public void setD(J01Point d) {
		this.d = d;
	}
	
	
	
	public int sideA() {
		int sideone = b.getX() - a.getX();
		return sideone;
	}
	
	public int sideB() {
		int sidetwo = b.getY() - c.getY();
		return sidetwo;
	}
	
	
	
	public void getPerimeter() {
		int total = (sideA()*2) + (sideB()*2);
		System.out.println("Perimeter of the rectangle is: " + total);
	}
 	
	public void getArea() {
		int surface = sideA() * sideB();
		System.out.println("Surface Area of the rectangle is: " + surface);
	}
	
	
}
