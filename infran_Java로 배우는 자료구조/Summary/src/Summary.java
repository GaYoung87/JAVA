import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  // Source - Organize Imports하면 자동으로 import진행

public class Summary {

	// 모든 것은 class 안에 있어야 함(변수, 함수 등)
	// 이런 class들이 여러개 모여 프로그램이 됨

	// class에 선언 -> static 붙여야함
	static String [] names = new String [1000];
	static int [] numbers = new int [1000];
	static int n = 0;

	public static void main(String[] args) {
		// input.txt 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력

		// 함수 내부에 선언
		// String [] names = new String [1000];
		// int [] numbers = new int [1000];

		// names[0] = "John";
		// numbers[0] = 123412345;  // 만약 위에서 numbers에 static안붙였으면 에러

		Scanner scanner;
		try {
			scanner = new Scanner(new File("input.txt"));

			while(scanner.hasNext()) {
				names[n] = scanner.next();
				numbers[n] = scanner.nextInt();
				n++;
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.print("No file");
			System.exit(9);
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println("Name: "+ names[i] + ", Numbers: "+ numbers[i]);
		}
	}


	static public void bubbleSort() {
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				// compareTo: > = < 가능
				if (numbers[j] > numbers[j+1]) {  // 문자열이므로 O: str1.equals(str2) / X: str1 == str2

					// 값 변경
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;

					String temp_str = names[j];
					names[j] = names[j+1];
					names[j+1] = temp_str;
				}
			}
		}

	}
}
