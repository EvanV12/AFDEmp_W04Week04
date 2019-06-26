package p04ShapesTeacher;

public class J05Hexagon extends J02Shape {

	public J05Hexagon() {
		super(6);
	}
	
	public J05Hexagon(J01Point[] p) {
		super(p);
	}
	
	public int sideH() {
		return Math.abs(getPoints()[1].getX() - getPoints()[0].getX());
	}

	
	public double area() {
		return (((Math.sqrt(3))*3)/2) * sideH() * sideH(); 				// Math.pow(sideH(), 2)
	}
	
	public double perimeter() {
		return 6 * sideH();
	}

	@Override
	public String toString() {
		return new String("Hexagon with area: " + area() + 
				" and perimeter: " + perimeter());
	}
	
	
}
