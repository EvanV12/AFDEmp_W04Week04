package p04ShapesTeacher;

public abstract class J02Shape {					// abstract class �� ���������� objects
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
		//1. ������� ������ ������� temp
		//2. ��������� �� �������� ��� ������
		//3. ������ points �� �� temp
		
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
