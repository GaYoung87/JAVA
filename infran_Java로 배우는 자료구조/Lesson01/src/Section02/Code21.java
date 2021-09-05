package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {

	static int n;
	static int [][] board;

	public static void main(String[] args) {
		// 2���� �迭���� �Ҽ�ã��
		// �Է����� n*n���� ���� �ƴ� ���ڸ� ������ �׸��� ���� �־�����, 
		// 8�������� ���ӵ� ���ڸ� ���� ���� �� �ִ� �Ҽ��� ã�� ����(�ߺ��� �� ����ص� ok)

		// 1. ��� ������ ����
		//     - ������, ����(0~7), ����(1~n)
		// 2. ���������� ȯ��
		// 3. �Ҽ��� ���

		try {
			Scanner inFile = new Scanner(new File("board.txt"));
			n = inFile.nextInt();
			board = new int [n][n];

			for (int i = 0; i < n ; i++) {
				for (int j = 0; j < n ; j++) {
					board[i][j] = inFile.nextInt();
				}
			}

			inFile.close();

			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					for (int dir = 0; dir < 8; dir++) {
						for (int len = 1; len < n; len++) {

							// computeValue : ������ġ (x,y)���� dir�������� ���̰� len�� ������ ������ ȯ��.
							//                ���� ������ -1
							int value = computeValue(x, y, dir, len);

							if (value != -1 && isPrime(value)) {
								System.out.println(value);
							}

						}

					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			// return;  // main�Լ��� �ƴ϶�� return ���ָ� �Լ����� �� ȣ���ϴ� �Լ��� ���ư� 
			System.exit(1);  // ���α׷� ��ü�� �����ض�
		}
	}


	public static int computeValue(int x, int y, int dir, int len) {

		int value = 0;

		// ������ġ (x,y)���� dir�������� iĭ ������ �ڸ��� �ִ� digit��ȯ
		// �׷��ڸ��� �������� ������ -1��ȯ
		for (int i = 0; i < len; i++) {
			int digit = getDigit(x, y, dir, i);
				if (digit == -1) {
					return -1;
				}

				value = value * 10 + digit;
			}

		return value;

	}


	static int [] offsetX = {0, 1, 1, 1, 0, -1, -1, -1};
	static int [] offsetY = {-1, -1, 0, 1, 1, 1, 0, -1};

	public static int getDigit(int x, int y, int dir, int k) {

		int newX = x + k * offsetX[dir];
		int newY = y + k * offsetY[dir];

		if ( newX < 0 || newX >= n || newY < 0 || newY >= n ) {
			return -1;
		}

		return board[newX][newY];

	}

	//	public static int getDigit(int x, int y, int dir, int k) {
	//		int newX = x;
	//		int newY = y;
	//		
	//		switch(dir) {
	//		case 0: newX -= k; newY -= k; break;
	//		case 1: newX -= k; break;
	//		case 2: newX -= k; newY += k; break;
	//		case 3: newY += k; break;
	//		case 4: newX += k; newY += k; break;
	//		case 5: newX += k; break;
	//		case 6: newX += k; newY -= k; break;
	//		case 7: newY -= k; break;
	//		}
	//		
	//		if ( newX < 0 || newX >= n || newY < 0 || newY >= n ) {
	//			return -1;
	//		}
	//		
	//		return board[newX][newY];
	//	}



	public static boolean isPrime(int k) {
		if (k < 2) {
			return false;
		}

		for (int i = 2; i < k/2; i ++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}

}
