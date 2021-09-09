package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// 다각형과 점
		// 입력으로 하나의 직교 다각형(모든 변이 x축 혹은 y축과 평행한 다각형)과 또 하나의 점 p가 주어질 때 그 점이 다각형의 내부에 있는지 외부에 있는지 판단하는 프로그램
		// 꼭지점 개수(n)개, 1~n번째 꼭지점 좌표(시계방향으로 제공), 테스트할 점p의 좌표

		// 내부 / 외부 검사
		// 점에서 시작하여 한 방향으로 무한히 뻗어가는 아무 직선이나 하나 그어서 그것이 다각형의 변과 짝수 번 교차하면 외부, 홀수 번 교차하면 내부에 있다
		// p점이 직교다각형의 라인과 겹치는 경우는 예외 -> 이런 경우 없다고 가정


		try {
			Scanner in = new Scanner(new File("point.txt"));
			int n = in.nextInt();
			// 꼭지점의 개수를 먼저 입력받아 다각형 생성
			OrthoPoly orthoPoly = new OrthoPoly(n);
			
			// 꼭지점의 좌표를 시계방향순으로 입력받아 다각형에 추가
			for (int i=0; i < n; i++) {
				orthoPoly.addVertex(new MyPoint2(in.nextInt(), in.nextInt()));
			}
			
			// 테슴트 할 점의 좌표를 입력받아 점 p형성
			MyPoint2 point = new MyPoint2(in.nextInt(), in.nextInt());
			in.close();
			
			// 내부인지 외부인지 확인
			if (orthoPoly.contains(point)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}

	}

}
