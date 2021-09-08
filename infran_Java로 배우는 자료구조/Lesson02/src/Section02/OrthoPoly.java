package Section02;

// �����ٰ����� ǥ���ϴ� ��
public class OrthoPoly {
	
	public int n;
	public MyPoint2 [] vertices;
	
	public OrthoPoly (int k) {
		n = 0;
		vertices = new MyPoint2 [k];  // �������� �ϳ��� �߰���
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
	// vertices ���鿡 ���� ���ο� �ִ���, �ܺο� �ִ��� Ȯ��
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
