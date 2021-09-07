package Section01;

import java.util.Scanner;

public class Code06 {

	static Polynomial [] polys = new Polynomial [100];  // ���׽��� �迭 ����
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
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].nTerms = 0;
				polys[n].terms = new Term [100];
				
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
					addTerm(polys[index], c, e);
					
				}
				
			} 
			else if (command.equals("calc")) {
				
				char name = keyboard.next().charAt(0);  // � �Լ��� print�� ������ Ȯ�� �ʿ�
				int index = find(name);  // �� �Լ��� �ִ��� Ȯ��
				
				if (index == -1) {  // ������ �������� �ʴ� ���׽� -> f�� �����ϴµ� �Է����� g 2 3�� ���� ���
					System.out.println("No such polynomial exists.");
				} else {
					int x = keyboard.nextInt();
					int result = calcPolynomial(polys[index], x);
					
					System.out.println(result);
				}
				
			} 
			else if (command.equals("print")) {
				
				char name = keyboard.next().charAt(0);  // � �Լ��� print�� ������ Ȯ�� �ʿ�
				int index = find(name);  // �� �Լ��� �ִ��� Ȯ��
				
				if (index == -1) {  // ������ �������� �ʴ� ���׽� -> f�� �����ϴµ� �Է����� g 2 3�� ���� ���
					System.out.println("No such polynomial exists.");
				} else {
					printPolynomial( polys[index]);
				}
				
			} 
			else if (command.equals("exit")) {
				break;
			}

		}
		keyboard.close();				
	}

	private static int calcPolynomial(Polynomial polynomial, int x) {
		int result = 0;
		for (int i = 0; i < polynomial.nTerms; i++) {
			result += calcTerm(polynomial.terms[i], x);
		}
		return result;
	}

	private static int calcTerm(Term term, int x) {
		return (int) (term.coef * Math.pow(x, term.exp));  // double�� ����� �����Ƿ� int�� ����
	}

	private static void printPolynomial(Polynomial polynomial) {
		
		for (int i = 0; i < polynomial.nTerms; i++) {
			printTerm(polynomial.terms[i]);
			System.out.print(" + ");
		}
		System.out.println();
	}

	private static void printTerm(Term term) {
		System.out.print(term.coef + "x^" + term.exp);
		
	}

	// �Լ��� �� ������
	private static void addTerm(Polynomial polynomial, int c, int e) {
		// ���׽Ŀ� ���ο� �� �߰��� �� ������ e�� ���� ������ ����� �����ֱ�
		// ������ e�� ���� ������ �־��ֱ�
		
		// ������ e�� ���� �ִ��� Ȯ��
		int index = findTerm(polynomial, e);
		
		if (index != -1) {  // ������ ������ e�� ���� �ִٸ�, ���� �����ֱ�
			polynomial.terms[index].coef += c;
			
		} else {  // ������ ������ e�� ���� ���� �� ���� ����� ����(insert�� ����)

			// polynomial: polys�� ĭ �� �ϳ��� ĭ���� ����
			int i = polynomial.nTerms - 1;  
			
			// ����(insert)
			while (i >= 0 && polynomial.terms[i].exp < 0) {
				polynomial.terms[i+1] = polynomial.terms[i];
				i--;
			}
			
			// �Լ�name : _ _ _ _ -> ���� �ϳ��� Term Ÿ��������������
			polynomial.terms[i+1] = new Term();
			polynomial.terms[i+1].coef = c;
			polynomial.terms[i+1].exp = e;
			polynomial.nTerms++;
		}
		
		
	}

	// e�� ���� �ִ��� ������ Ȯ��
	private static int findTerm(Polynomial polynomial, int e) {
		// ���� ������ e���� �۾����ٸ�, �ڿ��Ŵ� �� �ʿ���� -> ������� ���ĵǾ��ֱ� ����
		for (int i = 0; i < polynomial.nTerms; i++) {  // ó������ ���� Ȯ��
			if (polynomial.terms[i].exp == e) {
				return i;  // �� ������
			}
		}
		return -1; // �� ������
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
