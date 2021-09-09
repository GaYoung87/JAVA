package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// �ٰ����� ��
		// �Է����� �ϳ��� ���� �ٰ���(��� ���� x�� Ȥ�� y��� ������ �ٰ���)�� �� �ϳ��� �� p�� �־��� �� �� ���� �ٰ����� ���ο� �ִ��� �ܺο� �ִ��� �Ǵ��ϴ� ���α׷�
		// ������ ����(n)��, 1~n��° ������ ��ǥ(�ð�������� ����), �׽�Ʈ�� ��p�� ��ǥ

		// ���� / �ܺ� �˻�
		// ������ �����Ͽ� �� �������� ������ ����� �ƹ� �����̳� �ϳ� �׾ �װ��� �ٰ����� ���� ¦�� �� �����ϸ� �ܺ�, Ȧ�� �� �����ϸ� ���ο� �ִ�
		// p���� �����ٰ����� ���ΰ� ��ġ�� ���� ���� -> �̷� ��� ���ٰ� ����


		try {
			Scanner in = new Scanner(new File("point.txt"));
			int n = in.nextInt();
			// �������� ������ ���� �Է¹޾� �ٰ��� ����
			OrthoPoly orthoPoly = new OrthoPoly(n);
			
			// �������� ��ǥ�� �ð��������� �Է¹޾� �ٰ����� �߰�
			for (int i=0; i < n; i++) {
				orthoPoly.addVertex(new MyPoint2(in.nextInt(), in.nextInt()));
			}
			
			// �׽�Ʈ �� ���� ��ǥ�� �Է¹޾� �� p����
			MyPoint2 point = new MyPoint2(in.nextInt(), in.nextInt());
			in.close();
			
			// �������� �ܺ����� Ȯ��
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
