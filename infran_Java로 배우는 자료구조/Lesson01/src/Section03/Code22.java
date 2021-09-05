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
		// �ε��� ����Ŀ
		// �Է����� �ϳ��� �ؽ�Ʈ ���� �б�
		// �ؽ�Ʈ ���Ͽ� �����ϴ� ��� �ܾ���� ����� �����, �� �ܾ �ؽ�Ʈ ���Ͽ� �����ϴ� Ƚ�� ����
		// ��, �ܾ��� ������ 100000�� ������
		// ����ڰ� ��û�ϸ� �ܾ����� �ϳ��� ���Ϸ� ����
		// ����ڰ� �ܾ �˻��ϸ� �� �ܾ �ؽ�Ʈ ���Ͽ� �� �� �����ϴ��� ���
		
		// ���� ��
		// $ read sample.txt : �ؽ�Ʈ���� sample.txt�� �а� �ε��� �����
		// $ find heaven : heaven�̶�� �ܾ ��� �������� ���
		//      The word "heaven" appears 13 times.
		// $ saveas index.txt : �ε����� index.txt��� ���Ϸ� ����
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
	
	// �Ϲ����� �۾������� static�� ������ ��� ����
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
			
				String word = inFile.next();
				
				// word�� ������� �ܾ� ���� �� ���Ͽ� �ִ� �ܾ�� ��ġ�ϴ���?
				countWord(word);
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;  // ���ϸ� �߸� �Է½� �Լ� �ߴܽ�ų �ʿ� ���� �׳� return �� �ٽ� �Է� 
		}
		
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
		
		if (index != -1) {
			count[index]++;
		} else {  // ���ο� �ܾ�
			words[n] = word;
			count[n] = 1;
			n++;
		}
	}
	
	
	// ���� ������ �ܾ� ��Ͽ� ���ԵǾ� �ִ��� 
	static int findWord(String word) {
		for (int i = 0; i < n; i++) {
			if (words[i].equals(word)) {
				// equals: ��ҹ��� ����
				// equalsIgnoreCase: ��ҹ��� ����X
				return i;
			}
		}
		return -1;
	}

}
