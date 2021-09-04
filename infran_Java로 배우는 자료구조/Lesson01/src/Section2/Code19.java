package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		// input.txt 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력
		
		String [] name = new String [1000];  // String [큰 수]
		String [] number = new String [1000];
		int count = 0;  //
		
		
		
		Scanner inFile;
		try {
			inFile = new Scanner(new File("input.txt"));
			
			while (inFile.hasNext()) {  // 더 읽을 데이터가 남아있으면
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			// return;  // main함수가 아니라면 return 써주면 함수종류 후 호출하는 함수로 돌아감 
			System.exit(1);  // 프로그램 자체를 종료해라
		}
		
		for (int i=0; i < count; i++) {
			System.out.println("Name: " + name[i] + ", Phone: " + number[i]);
		}

	}

}
