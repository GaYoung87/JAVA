package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	// main �Լ� ������ �̾Ƴ�
	static String [] name = new String [1000];
	static String [] number = new String [1000];
	static int n = 0;

	public static void main(String[] args) {
		// input.txt ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ���
		// ���� �̸� ������ ����


		Scanner inFile;
		try {
			inFile = new Scanner(new File("input.txt"));

			while (inFile.hasNext()) {  // �� ���� �����Ͱ� ����������
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}

			inFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			// return;  // main�Լ��� �ƴ϶�� return ���ָ� �Լ����� �� ȣ���ϴ� �Լ��� ���ư� 
			System.exit(1);  // ���α׷� ��ü�� �����ض�
		}

		bubbleSort();

		for (int i=0; i < n; i++) {
			System.out.println("Name: " + name[i] + ", Phone: " + number[i]);
		}
	}


	// class�ȿ��ֱ� ������ �Ű������� �Ѱ����� �ʾƵ� ������
	static void bubbleSort() {
		for (int i = n-1; i > 0; i--) {
			// ���� ū���� �� �ڷ� ������
			for (int j = 0; j < i; j++) {
				
				// compareTo: > = < ����
				if (name[j].compareTo(name[j+1]) > 0) {  // ���ڿ��̹Ƿ� O: str1.equals(str2) / X: str1 == str2
					
					// �� ����
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
	
