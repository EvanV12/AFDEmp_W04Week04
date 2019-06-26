package p04ShapesTeacher;

public abstract class J02Shape {					// abstract class δε δημιουργει objects
	private J01Point [] points;
	
	public J02Shape() { 
		points = new J01Point[6];
	}
	
	public J02Shape(J01Point [] p) {
		points = p;
	}
	
	public J02Shape(int n) {
		points = new J01Point[n];
	}

	public J02Shape(J02Shape p) {
		//1. φτιαχνω πινακα σημειων temp
		//2. αντιγραφω τα στοιχεια του πινακα
		//3. συνδεω points με το temp
		
		J01Point temp [] = new J01Point[p.getPoints().length];
		for (int i = 0; i < p.getPoints().length; i++) {
			temp[i] = new J01Point(p.getPoints()[i]);
			}	
		points = temp;
	}
	
	
	public J01Point[] getPoints() {
		return points;
	}
	public void setPoints(J01Point[] p) {
		this.points = p;
	}
	
	
	
	public abstract double perimeter();
	
	public abstract double area();
	
}
