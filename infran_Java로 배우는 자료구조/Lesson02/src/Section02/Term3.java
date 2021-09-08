package Section02;

public class Term3 {
	
	int coef;
	int exp;
	
	// main �Լ��� ���� �ִ� Ŭ���� �ȿ� �ִ� ���� ��� static
	// �ƴ� ���(�� ����) static ������ ����
	
	// Ŭ������ ������ �̸��� ������ return Ÿ���� ���� �޼��带 "������"��� ��
	// �����ڴ� ��ü�� ������ �� �ڵ����� ����
	// �����ڰ� ���� Term �� ���� ��ü ���� �� ���� �����Ͱ� �ʱ�ȭ
	// �����ڰ� �ִ� Term3�� ���� ��ü ������ �ʱ�ȭ �ѹ��� ����
	//  ex) Term3 t3 = new Term3(3, 2);
	public Term3(int c, int e) {
		coef = c;
		exp = e;
	}
	
	// Term2�� �Ϻκ��̸� "�ڱ��ڽ�"�� ���� ����ѿ� ��ȯ -> �Ű������� � ���� ���� �ʿ����
	// ��ü�� �ƴ�(���赵��) -> ���� / ȣ�� �Ұ� -> ��ü�� ������ ȣ�� ����
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, exp));  // double�� ����� �����Ƿ� int�� ����
	}

	// Term2�� �Ϻκ��̸� "�ڱ��ڽ�"�� ���� ����ѿ� ��ȯ -> �Ű������� � ���� ���� �ʿ����
	// ��ü�� �ƴ�(���赵��) -> ���� / ȣ�� �Ұ� -> ��ü�� ������ ȣ�� ����
	public void printTerm() {
		System.out.print(coef + "x^" + exp);
		
	}
	
	// calcTerm, printTerm�� ȣ���ϰ� �ʹٸ�
	// Term2 t = new Term2();
	// t.coef = 3;
	// t.exp = 2;
	// int result = t.calcTerm( exp );
	// t.printTerm();
}
