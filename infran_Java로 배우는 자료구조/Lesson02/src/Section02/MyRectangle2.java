package Section02;

public class MyRectangle2 {
	
	// ��ǥ�࿡ ������ �ϳ��� �簢���� ����-���� �������� �ʺ�, ���̿� ���� ����
	public MyPoint2 lu;
	public int width;
	public int height;
	
	// ���1 �Ǵ� ���2 ����
	// ���1
//	public MyRectangle2(int x, int y, int w, int h) {
//		lu = new MyPoint2(x, y);
//		width = w;
//		height = h;
//	}
	
	// ���2
	public MyRectangle2(MyPoint2 myPoint2, int w, int h) {
		lu = myPoint2;
		width = w;
		height = h;
	}
	
	// �簢�� ���� ����
	public int calcArea() {
		return width * height;
	}
	
	// class�� �����͵��� ���ڿ��� ǥ���� �� toString()���� ������ ����
	public String toString() {
		return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;
		
	}


}
