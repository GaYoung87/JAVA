package Section02;

// 직교다각형을 표현하는 것
public class OrthoPoly {
	
	public int n;
	public MyPoint2 [] vertices;
	
	public OrthoPoly (int k) {
		n = 0;
		vertices = new MyPoint2 [k];  // 꼭지점이 하나씩 추가됨
	}
	
	public OrthoPoly(MyPoint2 p, MyPoint2 myPoint2) {
		// TODO Auto-generated constructor stub
	}

	public void addVertex (MyPoint2 myPoint2) {
		vertices[n++] = new MyPoint2(myPoint2.x, myPoint2.y);
	}

	public int maxX() {
		int max = vertices[0].x;
		for (int i = 0; i < n; i++) {
			if (vertices[i].x > max) {
				max = vertices[i].x;
			}
		}
		return max;
	}
	// vertices 점들에 의해 내부에 있는지, 외부에 있는지 확인
	public boolean contains(MyPoint2 p) {
		Ortholine arrow = new Ortholine(p, new MyPoint2(maxX() + 1, p.y));
		int count = 0;
		
		for (int i=0; i<n; i++) {
			Ortholine edge = new Ortholine(vertices[i], vertices[(i+1)%n]);
			
			if (arrow.intersect(edge)) {
				count++;
			}
		}
		return (count % 2 == 1);
	}
}
