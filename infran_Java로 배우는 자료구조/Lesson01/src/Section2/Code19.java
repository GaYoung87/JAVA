package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		// input.txt ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ���
		
		String [] name = new String [1000];  // String [ū ��]
		String [] number = new String [1000];
		int count = 0;  //
		
		
		
		Scanner inFile;
		try {
			inFile = new Scanner(new File("input.txt"));
			
			while (inFile.hasNext()) {  // �� ���� �����Ͱ� ����������
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			// return;  // main�Լ��� �ƴ϶�� return ���ָ� �Լ����� �� ȣ���ϴ� �Լ��� ���ư� 
			System.exit(1);  // ���α׷� ��ü�� �����ض�
		}
		
		for (int i=0; i < count; i++) {
			System.out.println("Name: " + name[i] + ", Phone: " + number[i]);
		}

	}

}
