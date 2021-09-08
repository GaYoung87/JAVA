package Section02;

public class Term2 {
	
	int coef;
	int exp;
	
	// main �Լ��� ���� �ִ� Ŭ���� �ȿ� �ִ� ���� ��� static
	// �ƴ� ���(�� ����) static ������ ����
	
	
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
