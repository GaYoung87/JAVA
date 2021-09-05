package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {

	static int n;
	static int [][] board;

	public static void main(String[] args) {
		// 2차원 배열에서 소수찾기
		// 입력으로 n*n개의 음이 아닌 한자리 정수가 그림과 같이 주어지면, 
		// 8방향으로 연속된 숫자를 합쳐 만들 수 있는 소수를 찾아 나열(중복된 수 출력해도 ok)

		// 1. 모든 가능한 수열
		//     - 시작점, 방향(0~7), 길이(1~n)
		// 2. 정수값으로 환산
		// 3. 소수면 출력

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

							// computeValue : 시작위치 (x,y)에서 dir방향으로 길이가 len인 수열을 정수로 환산.
							//                값이 없으면 -1
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
			// return;  // main함수가 아니라면 return 써주면 함수종류 후 호출하는 함수로 돌아감 
			System.exit(1);  // 프로그램 자체를 종료해라
		}
	}


	public static int computeValue(int x, int y, int dir, int len) {

		int value = 0;

		// 시작위치 (x,y)에서 dir방향으로 i칸 떨어진 자리에 있는 digit반환
		// 그런자리가 존재하지 않으면 -1반환
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
