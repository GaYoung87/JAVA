package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

	// main class에는 static붙이고, 데이터 저장을 위한 class에는 static붙이지 않음
	static MyRectangle2 [] rects = new MyRectangle2 [100];  // 배열 선언 = 배열 생성
	// 배열 선언 = 배열의 주소를 저장하는 참조변수일 뿐이다!!!
	static int n = 0;  // 사각형 개수

	public static void main(String[] args) {
		// 사각형의 면적
		// 평면상에 좌표축에 평행한 n개의 직사각형에 관한 데이터를 입력받은 후,
		// 면적이 작은 것부터 큰 것 순으로 정렬하여 출력하는 프로그램 작성

		// ex) 0 1 2 4 : 왼쪽-위쪽 꼭지점 좌표가 (0, 1)이고, 너비가 2, 높이가 4

		try {
			Scanner in = new Scanner(new File("rectangular.txt"));

			while (in.hasNext()) {

				

				// rects[n].lu.x = in.nextInt(); 와 동일
				int x = in.nextInt();
				int y = in.nextInt();
				int w = in.nextInt();
				int h = in.nextInt();
				
				rects[n] = new MyRectangle2(new MyPoint2(x, y), w, h);

				n++;
			}

			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			// 사각형에 대한 정보 제공
			// System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
			System.out.println(rects[i].toString());
		}
	}


	private static void bubbleSort() {

		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (rects[j].calcArea() > rects[j+1].calcArea()) {

					// 값 변경
					MyRectangle2 temp = rects[j+1];
					rects[j+1] = rects[j];
					rects[j] = temp;

				}
			}

		}

	}
	
}
