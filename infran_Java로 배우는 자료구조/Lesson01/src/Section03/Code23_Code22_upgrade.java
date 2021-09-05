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
		// ������
		// 1) �Ҽ���. ��ǥ ���� Ư����ȣ�� �ܾ ����
		// 2) ���� ���� �ܾ�� ���
		// 3) �빮�ڿ� �ҹ��� �ٸ��ܾ�� ���
		// 4) �ܾ���� ���ĺ� ������ �����ϱ� ����(����: ���¼�)
		//      ���1.�ܾ�� �� ����
		//      ���2.�ܾ���� ���ĵ� ���� ����
		
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
	
	// �Ϲ����� �۾������� static�� ������ ��� ����
	// �о�� ���� �������� �ܾ� ���� + ����ã��(from countWord)
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
			
				String word = inFile.next();

				// 1, 2) �ܾ��� �յڿ� ���� Ư������ ����
				String trimmed = trimming(word);  // return trimmed�� �ܾ� or null
				if (trimmed != null ) {
					// word�� ������� �ܾ� ���� �� ���Ͽ� �ִ� �ܾ�� ��ġ�ϴ���?
					// 3) �빮�ڿ� �ҹ��� �ٸ��ܾ�� ���
					String t = trimmed.toLowerCase();
					countWord(t);
				}
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;  // ���ϸ� �߸� �Է½� �Լ� �ߴܽ�ų �ʿ� ���� �׳� return �� �ٽ� �Է� 
		}
		
	}
	
	
	// �ܾ��� �յڿ� ���� Ư������ ����
	static String trimming(String word) {
		
		int i = 0;  // ������
		// i��°�� ���ڰ� �ƴѰ��
		// !Character.isLetter(word.charAt(i)) = !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
		while( i < word.length() && !Character.isLetter(word.charAt(i))) {  // word=234%^%%�� ��츦 ����� i < word.length()
			i++;		
		}
		
		int j = word.length()-1;  // ���� 
		// i��°�� ���ڰ� �ƴѰ��
		// !Character.isLetter(word.charAt(i)) = !(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
		while( j >= 0 && !Character.isLetter(word.charAt(j))) {  // word=234%^%%�� ��츦 ����� i < word.length()
			j--;	
		}
		
		// System.out.println(word + " : " + i + ":" + j);
		// error����: ������ �������� ������ ������ �����ʿ� ���ִ�.(���ڿ����°��)
		if (i > j) {
			return null;
		}
		return word.substring(i, j+1); // i <=  < j+1
	}

	
	static void saveAs(String fileName) {
		// fileName ����ϴ� ���
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for (int i = 0; i < n; i++) {
				outFile.println(words[i] + " " + count[i]);  // ���Ϸ� ����ϰ� �ʹٸ�
			}
			outFile.close();
			
		} catch (IOException e) {
			System.out.println("No file");
			return;
		}
	}
	
	
	// ���� ������ �ܾ� ��Ͽ� ���ԵǾ� �ִ��� -> �ε��� �˷��ֱ�
	// ��ã���� -1�� ���� ���� ��ȯ
	static void countWord(String word) {
		int index = findWord(word);
		
		if (index != -1) {  // �̹� �����ϴ� �ܾ�
			count[index]++;
		} else {  // ���ο� �ܾ�
			
			// ordered list�� insert
			// 4-2) �ܾ���� ���ĺ� ������ ����(�ܾ���� ���ĵ� ���� ����)
			// �̶� �ڿ��� ���� �˻��ϴ°� good (�˻��ϸ鼭 �ڸ� ���� �� �� �ֱ�)
			
			int i = n-1;  // �� ������ �ܾ� ��ġ
			// �̹� lowerCase�� �����߱� ������ compareToIgnoreCase�����ص� ok
			for (;i>=0 && words[i].compareTo(word) > 0; i--) {
				words[i+1] = words[i];
				count[i+1] = count[i];
			}
			// ���� ����, ǥ�� ��� ����
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
	
	
	// ���� ������ �ܾ� ��Ͽ� ���ԵǾ� �ִ��� 
	static int findWord(String word) {
		for (int i = 0; i < n; i++) {
			// 3) �빮�ڿ� �ҹ��� �ٸ��ܾ�� ���
			if (words[i].equalsIgnoreCase(word)) {
				// equals: ��ҹ��� ����
				// equalsIgnoreCase: ��ҹ��� ����X
				return i;
			}
		}
		return -1;
	}

}
