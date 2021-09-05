package Section03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {
	
	static String [] words = new String [100000];
	static int [] count = new int [100000];
	static int n = 0;

	public static void main(String[] args) {
		// 인덱스 메이커
		// 입력으로 하나의 텍스트 파일 읽기
		// 텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 등장하는 횟수 세기
		// 단, 단어의 개수는 100000개 이하임
		// 사용자가 요청하면 단어목록을 하나의 파일로 저장
		// 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력
		
		// 실행 예
		// $ read sample.txt : 텍스트파일 sample.txt를 읽고 인덱스 만들기
		// $ find heaven : heaven이라는 단어가 몇번 나오는지 출력
		//      The word "heaven" appears 13 times.
		// $ saveas index.txt : 인덱스를 index.txt라는 파일로 저장
		//      The word "java" does not appear
		// $ exit
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.print("$");
			String command = keyboard.next();
			
			if (command.equals("read")) {
				String fileName = keyboard.next();
				makeIndex(fileName);

			} else if (command.equals("find")) {
				String str = keyboard.next();
				int index = findWord(str);
				if (index > -1) {
					System.out.println("The word " + words[index] + " appears " + count[index]+ " times.");
				} else {
					System.out.println("The word " + str + " does not appear.");
				}
				
			} else if (command.equals("saveas")) {
				String fileName = keyboard.next();
				saveAs(fileName);
				
			} else if (command.equals("exit")) {
				break;
			}
		}
		keyboard.close();
		
//		for (int i = 0; i < n; i++) {
//			System.out.println(words[i] + " " + count[i]);
//		}
		
	}
	
	// 일반적인 작업에서는 static이 예외인 경우 많음
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
			
				String word = inFile.next();
				
				// word가 순서대로 단어 읽을 때 파일에 있는 단어와 일치하는지?
				countWord(word);
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;  // 파일명 잘못 입력시 함수 중단시킬 필요 없이 그냥 return 후 다시 입력 
		}
		
	}
	
	
	static void saveAs(String fileName) {
		// fileName 출력하는 방법
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for (int i = 0; i < n; i++) {
				outFile.println(words[i] + " " + count[i]);  // 파일로 출력하고 싶다면
			}
			outFile.close();
			
		} catch (IOException e) {
			System.out.println("No file");
			return;
		}
	}
	
	
	// 내가 만들어둔 단어 목록에 포함되어 있는지 -> 인덱스 알려주기
	// 못찾으면 -1과 같은 숫자 반환
	static void countWord(String word) {
		int index = findWord(word);
		
		if (index != -1) {
			count[index]++;
		} else {  // 새로운 단어
			words[n] = word;
			count[n] = 1;
			n++;
		}
	}
	
	
	// 내가 만들어둔 단어 목록에 포함되어 있는지 
	static int findWord(String word) {
		for (int i = 0; i < n; i++) {
			if (words[i].equals(word)) {
				// equals: 대소문자 구분
				// equalsIgnoreCase: 대소문자 구분X
				return i;
			}
		}
		return -1;
	}

}
