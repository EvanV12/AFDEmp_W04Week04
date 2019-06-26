package p03Shapes;

public class J01Point {
	private int x;
	private int y;
	
	/*						constructor, ��������� �������� (default constructor)
	public Point() {}		������ ������� ����� ���	�������� (����������� �� ������� ���� ��� ����
							�� ����� ���� ��� constructor, ���������� � default, ����� ������ �� ��� ��������
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	*/
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;					//this (private) x
	}
	public void setY(int y) {
		this.y = y;					//this private y
	}
}
