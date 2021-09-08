package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

	// main class���� static���̰�, ������ ������ ���� class���� static������ ����
	static MyRectangle2 [] rects = new MyRectangle2 [100];  // �迭 ���� = �迭 ����
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

				

				// rects[n].lu.x = in.nextInt(); �� ����
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
			// �簢���� ���� ���� ����
			// System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
			System.out.println(rects[i].toString());
		}
	}


	private static void bubbleSort() {

		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (rects[j].calcArea() > rects[j+1].calcArea()) {

					// �� ����
					MyRectangle2 temp = rects[j+1];
					rects[j+1] = rects[j];
					rects[j] = temp;

				}
			}

		}

	}
	
}
