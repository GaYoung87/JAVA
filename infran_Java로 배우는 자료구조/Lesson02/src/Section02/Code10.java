package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// 다각형과 점
		
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
