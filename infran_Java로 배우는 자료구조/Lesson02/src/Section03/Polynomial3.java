package Section03;

public class Polynomial3 {

	private char name;  // ���׽��� �̸�: f, g ..
	// nTerms, terms�� private���� �ٲ㵵 �������ȳ� -> �ܺο��� ���������� �����ϴ� ��� ����
	private int nTerms;  // ���׽��� �����ϴ� ���� ����
	private Term3[] terms;  // ���׽��� �����ϴ� �׵��� ������ �迭

	// �����ڰ� �ݵ�� �Ű������� �޾ƾ��ϴ� ���� �ƴ�
	// �����ڴ� ��ü���� �ʿ��� �ʱ�ȭ �۾��� �ϱ⿡ ����
	public Polynomial3() {
		nTerms = 0;
		terms = new Term3 [100];  // �迭 terms ����
	}
	
	// �Ű����� ������ ������
	// ������ ������ ���� �� ����
	public Polynomial3(char name) {
		this.name = name;  // �̸��� �����ϴٸ� this.A = A�� �ۼ�
		// name = str;  
		// �Ű����� �̸� = name 
		// ->������ ������ name���� �Ű����� name���� ���кҰ� -> �Ű����� �̸� ����
		nTerms = 0;
		terms = new Term3 [100]; 
	}
	
	
	// �Լ��� �� ������
	public void addTerm(int c, int e) {
		// ���׽Ŀ� ���ο� �� �߰��� �� ������ e�� ���� ������ ����� �����ֱ�
		// ������ e�� ���� ������ �־��ֱ�

		// ������ e�� ���� �ִ��� Ȯ��
		int index = findTerm(e);

		if (index != -1) {  // ������ ������ e�� ���� �ִٸ�, ���� �����ֱ�
			terms[index].setCoef(terms[index].getCoef() + c);

		} else {  // ������ ������ e�� ���� ���� �� ���� ����� ����(insert�� ����)

			// polynomial: polys�� ĭ �� �ϳ��� ĭ���� ����
			int i = nTerms - 1;  

			// ����(insert)
			// ���� Term3���� private int exp���ٸ�, terms[i].exp�ϸ� �������!! ���� �Ұ�!!
			// * Term3���� public int exp�� ��� terms[i].exp�ؾ���
			//    1) �� �ȿ� �ִ� exp ���� �� ����
			//    2) exp�� ���� ����
			// * Term3���� private int exp�� ��� terms[i].getExp()�ؾ���
			//    1) �� �ȿ� �ִ� exp ���� �� ����
			//    2) exp�� ���� �Ұ�
			while (i >= 0 && terms[i].getExp() < 0) {
				terms[i+1] = terms[i];
				i--;
			}

			// �Լ�name : _ _ _ _ -> ���� �ϳ��� Term Ÿ��������������
			terms[i+1] = new Term3(c, e);
			nTerms++;
		}
	}

	// e�� ���� �ִ��� ������ Ȯ��
	private int findTerm(int e) {
		// ���� ������ e���� �۾����ٸ�, �ڿ��Ŵ� �� �ʿ���� -> ������� ���ĵǾ��ֱ� ����
		for (int i = 0; i < nTerms; i++) {  // ó������ ���� Ȯ��
			if (terms[i].getExp() == e) {
				return i;  // �� ������
			}
		}
		return -1; // �� ������
	}

	public int calcPolynomial(int x) {
		int result = 0;
		for (int i = 0; i < nTerms; i++) {
			result += terms[i].calcTerm(x);
		}
		return result;
	}

	public void printPolynomial() {

		for (int i = 0; i < nTerms; i++) {
			terms[i].printTerm();
			System.out.print(" + ");
		}
		System.out.println();
	}

	// �ܺο��� name�̶�°� �ʿ��ϸ� getName()�̿�.
	public char getName() {
		return name;
	}

}
