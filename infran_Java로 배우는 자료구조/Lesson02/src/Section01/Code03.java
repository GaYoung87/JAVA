package Section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {

	static Person01 [] members = new Person01 [100];  // ������ ĭ�鵵 ��������
	static int count = 0;
	
	public static void main(String[] args) {
		// data.txt�κ��� ������� �̸��� ��ȭ��ȣ�� �Է¹ް� ���������� �����Ͽ� ���
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while (in.hasNext()) {
				String str1 = in.next();
				String str2 = in.next();
				
				members[count] = new Person01();  // members[count] ������ ���ο� ��ü �ʿ�
				
				members[count].name = str1;
				members[count].number = str2;
				
				count++;
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}
		
		bubbleSort();
		
		for (int i = 0; i < count; i++) {
			System.out.println(members[i].name + "'s phone number is " + members[i].number);
		}

	}
	
	private static void bubbleSort() {
		
		for (int i = count-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (members[j].name.compareTo(members[j+1].name) > 0) {
					
					// �� ����
					Person01 temp = members[j];
					members[j] = members[j+1];
					members[j+1] = temp;
					
				}
			}

		}
		
	}

}
