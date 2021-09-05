package Section03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code23_Code22_upgrade {
	
	static String [] words = new String [100000];
	static int [] count = new int [100000];
	static int n = 0;

	public static void main(String[] args) {
		// 문제점
		// 1) 소수점. 쉼표 등의 특수기호가 단어에 포함
		// 2) 숫자 등이 단어로 취급
		// 3) 대문자와 소문자 다른단어로 취급
		// 4) 단어들이 알파벳 순으로 정렬하기 원함(기존: 나온순)
		//      방법1.단어나열 후 정렬
		//      방법2.단어나열시 정렬된 상태 유지
		
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
	// 읽어온 파일 기준으로 단어 구분 + 갯수찾기(from countWord)
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
			
				String word = inFile.next();

				// 1, 2) 단어의 앞뒤에 붙은 특수문자 제거
				String trimmed = trimming(word);  // return trimmed된 단어 or null
				if (trimmed != null ) {
					// word가 순서대로 단어 읽을 때 파일에 있는 단어와 일치하는지?
					// 3) 대문자와 소문자 다른단어로 취급
					String t = trimmed.toLowerCase();
					countWord(t);
				}
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;  // 파일명 잘못 입력시 함수 중단시킬 필요 없이 그냥 return 후 다시 입력 
		}
		
	}
	
	
	// 단어의 앞뒤에 붙은 특수문자 제거
	static String trimming(String word) {
		
		int i = 0;  // 시작점
		// i번째가 문자가 아닌경우
		// !Character.isLetter(word.charAt(i)) = !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
		while( i < word.length() && !Character.isLetter(word.charAt(i))) {  // word=234%^%%인 경우를 대비해 i < word.length()
			i++;		
		}
		
		int j = word.length()-1;  // 끝점 
		// i번째가 문자가 아닌경우
		// !Character.isLetter(word.charAt(i)) = !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
		while( j >= 0 && !Character.isLetter(word.charAt(j))) {  // word=234%^%%인 경우를 대비해 i < word.length()
			j--;	
		}
		
		// System.out.println(word + " : " + i + ":" + j);
		// error이유: 구간의 시작점이 구간의 끝보다 오른쪽에 가있다.(문자열없는경우)
		if (i > j) {
			return null;
		}
		return word.substring(i, j+1); // i <=  < j+1
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
		
		if (index != -1) {  // 이미 존재하는 단어
			count[index]++;
		} else {  // 새로운 단어
			
			// ordered list에 insert
			// 4-2) 단어들이 알파벳 순으로 정렬(단어나열시 정렬된 상태 유지)
			// 이때 뒤에서 부터 검사하는게 good (검사하면서 자리 변경 후 값 넣기)
			
			int i = n-1;  // 맨 마지막 단어 위치
			// 이미 lowerCase로 변경했기 때문에 compareToIgnoreCase사용안해도 ok
			for (;i>=0 && words[i].compareTo(word) > 0; i--) {
				words[i+1] = words[i];
				count[i+1] = count[i];
			}
			// 위와 동일, 표현 방식 상이
//			for (i>=0 && words[i].compareToIgnoreCase(word) > 0) {
//				words[i+1] = words[i];
//				count[i+1] = count[i];
//              i--;
//			}
			
			words[i+1] = word;
			count[i+1] = 1;
			n++;
		}
	}
	
	
	// 내가 만들어둔 단어 목록에 포함되어 있는지 
	static int findWord(String word) {
		for (int i = 0; i < n; i++) {
			// 3) 대문자와 소문자 다른단어로 취급
			if (words[i].equalsIgnoreCase(word)) {
				// equals: 대소문자 구분
				// equalsIgnoreCase: 대소문자 구분X
				return i;
			}
		}
		return -1;
	}

}
