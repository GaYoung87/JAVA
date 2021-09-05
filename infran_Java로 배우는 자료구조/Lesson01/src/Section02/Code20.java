package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	// main 함수 밖으로 뽑아냄
	static String [] name = new String [1000];
	static String [] number = new String [1000];
	static int n = 0;

	public static void main(String[] args) {
		// input.txt 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력
		// 이후 이름 순으로 정렬


		Scanner inFile;
		try {
			inFile = new Scanner(new File("input.txt"));

			while (inFile.hasNext()) {  // 더 읽을 데이터가 남아있으면
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}

			inFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			// return;  // main함수가 아니라면 return 써주면 함수종류 후 호출하는 함수로 돌아감 
			System.exit(1);  // 프로그램 자체를 종료해라
		}

		bubbleSort();

		for (int i=0; i < n; i++) {
			System.out.println("Name: " + name[i] + ", Phone: " + number[i]);
		}
	}


	// class안에있기 때문에 매개변수로 넘겨주지 않아도 괜찮음
	static void bubbleSort() {
		for (int i = n-1; i > 0; i--) {
			// 가장 큰값을 맨 뒤로 보내기
			for (int j = 0; j < i; j++) {
				
				// compareTo: > = < 가능
				if (name[j].compareTo(name[j+1]) > 0) {  // 문자열이므로 O: str1.equals(str2) / X: str1 == str2
					
					// 값 변경
					String temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;
					
					temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}

		}
	}
		
}
	
