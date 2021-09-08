package Section02;

public class Ortholine {
	
	public MyPoint2 u;  // 점 두개가 있으면 선이 됨
	public MyPoint2 v;
	
	public Ortholine (MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		// 무조건 왼쪽이 u, 오른쪽이 v가 될 수 있게 변경
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
	
	// 수직선분인지 검사
	public boolean isVertical() {
		return u.x == v.x;
	} 
	public boolean intersect( Ortholine ortholine ) {
		// u, v가 수직 + 다른라인이 수평
		// 수직선을 기준으로 다른 라인이 하나는 나의 왼쪽, 하나는 나의 오른쪽이면 교차
		if (isVertical() && ortholine.isVertical()) {
			return (ortholine.u.x < u.x && ortholine.v.x > u.x && u.y < ortholine.u.y && v.y > ortholine.u.y);
		} else if (!isVertical() && ortholine.isVertical()) {
			return (ortholine.u.y < u.y && ortholine.v.y > u.y && u.x < ortholine.u.x && v.x > ortholine.u.x);
		} else {
			return false;
		}
		
		
	}
	
}
