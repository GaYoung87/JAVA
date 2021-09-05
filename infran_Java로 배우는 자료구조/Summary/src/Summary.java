import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  // Source - Organize Imports�ϸ� �ڵ����� import����

public class Summary {

	// ��� ���� class �ȿ� �־�� ��(����, �Լ� ��)
	// �̷� class���� ������ �� ���α׷��� ��

	// class�� ���� -> static �ٿ�����
	static String [] names = new String [1000];
	static int [] numbers = new int [1000];
	static int n = 0;

	public static void main(String[] args) {
		// input.txt ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ���

		// �Լ� ���ο� ����
		// String [] names = new String [1000];
		// int [] numbers = new int [1000];

		// names[0] = "John";
		// numbers[0] = 123412345;  // ���� ������ numbers�� static�Ⱥٿ����� ����

		Scanner scanner;
		try {
			scanner = new Scanner(new File("input.txt"));

			while(scanner.hasNext()) {
				names[n] = scanner.next();
				numbers[n] = scanner.nextInt();
				n++;
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.print("No file");
			System.exit(9);
		}

		bubbleSort();

		for (int i = 0; i < n; i++) {
			System.out.println("Name: "+ names[i] + ", Numbers: "+ numbers[i]);
		}
	}


	static public void bubbleSort() {
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				// compareTo: > = < ����
				if (numbers[j] > numbers[j+1]) {  // ���ڿ��̹Ƿ� O: str1.equals(str2) / X: str1 == str2

					// �� ����
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;

					String temp_str = names[j];
					names[j] = names[j+1];
					names[j+1] = temp_str;
				}
			}
		}

	}
}
