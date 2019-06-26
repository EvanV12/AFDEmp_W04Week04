package p03Shapes;

public abstract class J02Shapes {

	private int n;
	private J01Point p[];
	
	
	public J02Shapes() {}
	
	public J02Shapes(int n) {
		//points = new Point[n];
	}
	//Point p [] = new Point[n];
	

	
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	

	public J01Point[] getP() {
		return p;
	}

	public void setP(J01Point[] p) {
		this.p = p;
	}

	public abstract void getPerimeter();
	
	public abstract void getArea();
	

}
