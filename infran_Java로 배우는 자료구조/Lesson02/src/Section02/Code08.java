package Section02;

import java.util.Scanner;

//Code07���� upgrade
public class Code08 {

	static Polynomial3 [] polys = new Polynomial3 [100];  // ���׽��� �迭 ����
	static int n = 0;  // ���׽� ����
	
	public static void main(String[] args) {
		// �����Լ� : �׵��� ���̸�, ���� ����� ������ ���� ����
		// ����� 0�� �ƴ� �����̰�, ������ ���̾ƴ� ������� ����
		// ex) f(x) = -x^5 + 2x^4 - 10x - 3
		
		// ���� ��
		// $ create f : �����Լ� f = 0�� ����
		// $ add f 2 3 : f(x) = 2x^3
		// $ add f -1 1 : f(x) = 2x^3 - x 
		// ...
		// $ calc f 2 : f(2)���� ����Ͽ� ���
		// $ print f : ������ ���� ���������ɷ� ������ ������ ���� ��� 
		//          ������ ������ ���� �ϳ��� ��ġ��
		// $ create g : �����Լ� g = 0 ����
		// ...
		// $ exit
		
		Scanner keyboard = new Scanner (System.in);
		
		while ( true ) {
			System.out.print("$ ");
			String command = keyboard.next();
			if (command.equals("create")) {
				
				// �Լ� �̸� �Է¹ް�
				char name = keyboard.next().charAt(0);  // nextChar()�� ���� ����: ���鵵 �ϳ��� ���ڷ� ó���Ǳ� ����
				
				// Polynomial: ���׽��� ǥ���ϱ� ���� Ŭ����
				// ploys�� �� ĭ���� �����ϴ� Polynomial��ü���� �̸��� ���� ����
				polys[n] = new Polynomial3();
				
				// �� �κе� �����ڷ� ������ָ� ���� 
				// polys[n].name = name;
				
				n++;  // polys�� ���� -> polys�� index
			} 
			else if (command.equals("add")) {  // f 2 3
				
				// �Լ���(f) �Է¹ް�
				char name = keyboard.next().charAt(0);
				// �Լ��� ������ �����ϴ��� Ȯ��
				int index = find(name);
				
				// ������ �������� �ʴ� ���׽� -> f�� �����ϴµ� �Է����� g 2 3�� ���� ���
				if (index == -1) {  
					System.out.println("No such polynomial exists.");
				}
				// �����ϸ�
				else {
					// c, e(2, 3) �Է¹ް�
					int c = keyboard.nextInt();
					int e = keyboard.nextInt();
					// �Լ��� �� ������
					polys[index].addTerm(c, e);
				}
			} 
			else if (command.equals("calc")) {
				
				char name = keyboard.next().charAt(0);  // � �Լ��� print�� ������ Ȯ�� �ʿ�
				int index = find(name);  // �� �Լ��� �ִ��� Ȯ��
				
				if (index == -1) {  // ������ �������� �ʴ� ���׽� -> f�� �����ϴµ� �Է����� g 2 3�� ���� ���
					System.out.println("No such polynomial exists.");
				} else {
					int x = keyboard.nextInt();
					int result = polys[index].calcPolynomial(x);
					
					System.out.println(result);
				}
				
			} 
			else if (command.equals("print")) {
				
				char name = keyboard.next().charAt(0);  // � �Լ��� print�� ������ Ȯ�� �ʿ�
				int index = find(name);  // �� �Լ��� �ִ��� Ȯ��
				
				if (index == -1) {  // ������ �������� �ʴ� ���׽� -> f�� �����ϴµ� �Է����� g 2 3�� ���� ���
					System.out.println("No such polynomial exists.");
				} else {
					polys[index].printPolynomial();
				}
				
			} 
			else if (command.equals("exit")) {
				break;
			}

		}
		keyboard.close();				
	}

	// �Լ����� polys�� �ִ��� Ȯ��
	private static int find(char name) {  // f���� g����
		for (int i = 0; i < n; i ++) {  // polys�� ���鼭 Ȯ��
			if (polys[i].name == name) {  // ������ ������ ���° �Լ������� index��ȯ
				return i;
			}
		}
		return -1;  // �������� �ʴ� �Լ���
	}

}
