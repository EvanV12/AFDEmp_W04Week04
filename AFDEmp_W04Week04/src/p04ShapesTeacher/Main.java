package p04ShapesTeacher;

public class Main {

	public static void main(String[] args) {
		
		// create Points
		J01Point p1 = new J01Point();
		p1.setX(1);
		p1.setY(5);
		
		J01Point p2 = new J01Point();
		p2.setX(5);
		p2.setY(5);
		
		J01Point p3 = new J01Point();
		p3.setX(5);
		p3.setY(2);

		J01Point p4 = new J01Point();
		p4.setX(1);
		p4.setY(2);
		
		J01Point p5 = new J01Point(3, 4);
		J01Point p6 = new J01Point(6, 1);
		
		J01Point[] rect_points = { p1, p2, p3, p4 } ;
		J04Rectangle r1 = new J04Rectangle(rect_points);
		
		
		
		
		
		J01Point[] circle_point = { new J01Point(0, 0) };
		J03Circle c1 = new J03Circle(circle_point, 5.3);
		
		J01Point[] hex_points = {p1, p2, p3, p4, p5, p6};
		J05Hexagon h1 = new J05Hexagon (hex_points);
		
	//	Point[] rect_points2 = { p1, p2, p3, p4 } ;
		J04Rectangle r2 = new J04Rectangle (r1);
		r2.getPoints()[0].setX(0);
		
		// declare shape reference and use it for polymorphism
		J02Shape s = r1;
		System.out.println(s.toString());
		
		s = c1;
		System.out.println(s.toString());
		
		s = h1;
		System.out.println(s.toString());
		
		
	//	s = r2;
	//	System.out.println(s.toString());
	}
}
