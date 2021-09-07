package Section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

	// main class���� static���̰�, ������ ������ ���� class���� static������ ����
	static MyRectangle1 [] rects = new MyRectangle1 [100];  // �迭 ���� = �迭 ����
	// �迭 ���� = �迭�� �ּҸ� �����ϴ� ���������� ���̴�!!!
	static int n = 0;  // �簢�� ����

	public static void main(String[] args) {
		// �簢���� ����
		// ���� ��ǥ�࿡ ������ n���� ���簢���� ���� �����͸� �Է¹��� ��,
		// ������ ���� �ͺ��� ū �� ������ �����Ͽ� ����ϴ� ���α׷� �ۼ�

		// ex) 0 1 2 4 : ����-���� ������ ��ǥ�� (0, 1)�̰�, �ʺ� 2, ���̰� 4

		try {
			Scanner in = new Scanner(new File("rectangular.txt"));

			while (in.hasNext()) {

				rects[n] = new MyRectangle1();

				// rects[n].lu.x = in.nextInt(); �� ����
				int x = in.nextInt();
				int y = in.nextInt();
				int w = in.nextInt();
				int h = in.nextInt();

				// lu�� MyPoint1�� ���������� (width, height�� ������Ƽ��Ÿ��)
				rects[n].lu = new MyPoint1();
				rects[n].lu.x = x;
				rects[n].lu.y = y;
				rects[n].width = w;
				rects[n].height = h;

				n++;
			}

			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println(rects[n].lu.x + " " + rects[n].lu.y + " " + rects[n].width + " " + rects[n].height);
		}
	}


	private static void bubbleSort() {

		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (calcArea(rects[j]) > calcArea(rects[j+1])) {

					// �� ����
					MyRectangle1 temp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = temp;

				}
			}

		}

	}
	
	
	public static int calcArea(MyRectangle1 r) {
		return r.width * r.height;
	}

}
