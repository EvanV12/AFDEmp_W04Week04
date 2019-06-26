package p03Shapes;

public class MainShapes {

	public MainShapes() {}

	public static void main(String[] args) {
		
		
		J01Point p6[] = new J01Point[1];
		p6[0].setX(4);
		p6[0].setY(5);
		
		
		J01Point p1 = new J01Point();
		p1.setX(1);
		p1.setY(5);
			
		J01Point p2 = new J01Point();
		p2.setX(5);
		p2.setY(5);
		
		J01Point p3 = new J01Point();
		p3.setX(1);
		p3.setY(2);
		
		J01Point p4 = new J01Point();
		p4.setX(5);
		p4.setY(2);
		
		J01Point p5 = new J01Point();
		p5.setX(8);
		p5.setY(8);
		
		J02Shapes rectangle1 = new J04Rectangle(p1, p2, p3, p4);
		J02Shapes circle1 = new J03Circle (p5, 5);
		
		J02Shapes circleX = new J03Circle (p6, 5);
		
		rectangle1.getPerimeter();
		rectangle1.getArea();
		
		System.out.println();
		
		circle1.getPerimeter();
		circle1.getArea();
		
		System.out.println();
		
		circleX.getPerimeter();
		circleX.getArea();
		
	}

}
