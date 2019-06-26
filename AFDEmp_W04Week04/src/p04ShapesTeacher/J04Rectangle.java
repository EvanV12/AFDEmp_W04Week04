package p04ShapesTeacher;

import p04ShapesTeacher.Renderable;

public class J04Rectangle extends J02Shape implements Renderable {
	
	public J04Rectangle() { 
		super(4);
	}
	
	public J04Rectangle(J01Point[] p) {
		super(p);
	}
	
	
	public J04Rectangle (J04Rectangle r) {
		super(r);
	}
	
	
	
	public int sideA() {
		return Math.abs(getPoints()[1].getX() - getPoints()[0].getX());
	}
	
	public int sideB() {
		return Math.abs(getPoints()[1].getY() - getPoints()[2].getY());
	}
	
	public double area() {
		return sideA() * sideB();
	}
	
	public double perimeter() {
		return 2 * sideA() + 2 * sideB();
	}
	
	public String toString() {
		return new String("Rectangle with area: " + area() + 
				" and perimeter: " + perimeter());
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
