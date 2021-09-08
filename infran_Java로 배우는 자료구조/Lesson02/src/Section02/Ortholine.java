package Section02;

public class Ortholine {
	
	public MyPoint2 u;  // �� �ΰ��� ������ ���� ��
	public MyPoint2 v;
	
	public Ortholine (MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		// ������ ������ u, �������� v�� �� �� �ְ� ����
		if (p.x > q.x || p.x == q.x && p.y > q.y ) {
			swap();
		}
	}
	
	private void swap() {
		MyPoint2 temp = u;
		u = v;
		v = temp;
	}
	
	public Ortholine (int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}
	
	// ������������ �˻�
	public boolean isVertical() {
		return u.x == v.x;
	} 
	public boolean intersect( Ortholine ortholine ) {
		// u, v�� ���� + �ٸ������� ����
		// �������� �������� �ٸ� ������ �ϳ��� ���� ����, �ϳ��� ���� �������̸� ����
		if (isVertical() && ortholine.isVertical()) {
			return (ortholine.u.x < u.x && ortholine.v.x > u.x && u.y < ortholine.u.y && v.y > ortholine.u.y);
		} else if (!isVertical() && ortholine.isVertical()) {
			return (ortholine.u.y < u.y && ortholine.v.y > u.y && u.x < ortholine.u.x && v.x > ortholine.u.x);
		} else {
			return false;
		}
		
		
	}
	
}
