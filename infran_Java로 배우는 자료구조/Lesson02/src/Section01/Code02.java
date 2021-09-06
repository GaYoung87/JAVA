package Section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {

	// �����κ�1.
	// static Person01 [] members;
	static Person01 [] members = new Person01 [100];  // ������ ĭ�鵵 ��������
	static int count = 0;
	
	public static void main(String[] args) {
		// data.txt�κ��� ������� �̸��� ��ȭ��ȣ�� �Է¹޾� �迭 members�� ����
		// ���� �Էµ� ������� ����϶�� �Ѵ�. 
		// �� �ڵ忡�� �߸��� ������ ã�� �����϶�
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while (in.hasNext()) {
				String str1 = in.next();
				String str2 = in.next();
				
				// �����κ�2.
				// ������ ĭ�� ���������̹Ƿ� Person01()��ü �ʿ�
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
		
		for (int i = 0; i < count; i++) {
			System.out.println(members[i].name + "'s phone number is " + members[i].number);
		}

	}

}
