package p04ShapesTeacher;

public class J01Point {
	private int x;
	private int y;
	
	public J01Point() { }
	
	public J01Point(J01Point p) {
		this(p.getX(), p.getY());
	}
	
	public J01Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
