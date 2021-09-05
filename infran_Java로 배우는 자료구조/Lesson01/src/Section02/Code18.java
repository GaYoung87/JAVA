package Section02;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		// n���� ������ �Է¹��� �� ������������ �����Ͽ� ����ϴ� �ڵ�
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();
		
		bubbleSort(n, data);
		
		System.out.println("Sorted data: ");
		for (int i = 0; i < n ; i++) {
			System.out.println(data[i]);
		}
		
	}
	
	// n�� �Լ����ο� �־ bubbleSort�Լ� �������� ����� �� ���� -> �Ű������� �Ѱ���
	// void: �ƹ��͵� �������� �ʴ´ٴ� �ǹ�
	static void bubbleSort( int n, int [] data ) {  
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j+1]) {
					
					// data�� ����
					swap(data[j], data[j+1]);
					
				}
			} 
		}
		
//		return;  ��� �����ִ� ���� + �Լ� ���� �ߴ�

	}
	
	// ȣ�⹮ swap�� ���� ȣ��� �޼���
	// �̷���� swap�� �̷������ ����
	// swap�޼��带 ȣ���ϴ� ���� data[j], data[j+1]�� ���� ���� a,b�� �����
	// ���� ���� ������ ���� -> swap������ a,b���� �����ϴ°��̹Ƿ� 
	//                      data[j], data[j+1] ���� ��ȭ����
	// ���� ���� ȣ��
	
	// ������Ƽ�� Ÿ���� ȣ��� �޼��忡�� ���� �����ص� ȣ���� �ʿ� ������ ���� ����
	// ������Ƽ�� Ÿ���� �ƴ� ���(String, �迭 ��)�� ȣ��� �޼��忡�� �����ϸ� ȣ���� �ʿ����� �����
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
