package Section02;

public class MyRectangle2 {
	
	// 좌표축에 평행항 하나의 사각형은 왼쪽-위쪽 꼭지점과 너비, 높이에 의해 정의
	public MyPoint2 lu;
	public int width;
	public int height;
	
	// 방법1 또는 방법2 선택
	// 방법1
//	public MyRectangle2(int x, int y, int w, int h) {
//		lu = new MyPoint2(x, y);
//		width = w;
//		height = h;
//	}
	
	// 방법2
	public MyRectangle2(MyPoint2 myPoint2, int w, int h) {
		lu = myPoint2;
		width = w;
		height = h;
	}
	
	// 사각형 면적 넓이
	public int calcArea() {
		return width * height;
	}
	
	// class의 데이터들을 문자열로 표현할 때 toString()으로 지으면 좋음
	public String toString() {
		return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;
		
	}


}
