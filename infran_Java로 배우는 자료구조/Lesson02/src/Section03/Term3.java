package Section03;

public class Term3 {
	
	// int coef; int exp; �ϸ� Section03 ��Ű�� �������� ��밡��, �̿� ��Ű�� ���Ұ���
	
	private int coef;  // public int coef���� refactor-encapsulated field�ϸ� 
	                   // �ڵ����� private, getter, setter, ����������¹�� ���� 
	private int exp;
	
	// main �Լ��� ���� �ִ� Ŭ���� �ȿ� �ִ� ���� ��� static
	// �ƴ� ���(�� ����) static ������ ����
	
	// Ŭ������ ������ �̸��� ������ return Ÿ���� ���� �޼��带 "������"��� ��
	// (������ Term2)
	public Term3(int c, int e) {
		setCoef(c);
		exp = e;
	}
	
	// getter method
	// exp�� ���� �����ڿ��� �ѹ� �������� �ٽ� �ٲ� �� ���� -> getter�� ����
	public int getExp() {
		return exp;
	}
	
	// coef�� �� Ŭ������ �ܺο��� �а� ���� �����ؾ��ϹǷ� public�� private���� �����ϴ� ���
	// getter, setter �ʿ�	
	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}
	
	// Term2�� �Ϻκ��̸� "�ڱ��ڽ�"�� ���� ����ѿ� ��ȯ -> �Ű������� � ���� ���� �ʿ����
	// ��ü�� �ƴ�(���赵��) -> ���� / ȣ�� �Ұ� -> ��ü�� ������ ȣ�� ����
	public int calcTerm(int x) {
		return (int) (getCoef() * Math.pow(x, exp));  // double�� ����� �����Ƿ� int�� ����
	}

	// Term2�� �Ϻκ��̸� "�ڱ��ڽ�"�� ���� ����ѿ� ��ȯ -> �Ű������� � ���� ���� �ʿ����
	// ��ü�� �ƴ�(���赵��) -> ���� / ȣ�� �Ұ� -> ��ü�� ������ ȣ�� ����
	public void printTerm() {
		System.out.print(getCoef() + "x^" + exp);
		
	}
	
	// calcTerm, printTerm�� ȣ���ϰ� �ʹٸ�
	// Term2 t = new Term2();
	// t.coef = 3;
	// t.exp = 2;
	// int result = t.calcTerm( exp );
	// t.printTerm();
}
