package Section02;

public class Polynomial3 {

	public char name;  // ���׽��� �̸�: f, g ..
	public int nTerms;  // ���׽��� �����ϴ� ���� ����
	public Term3[] terms;  // ���׽��� �����ϴ� �׵��� ������ �迭

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
			terms[index].coef += c;

		} else {  // ������ ������ e�� ���� ���� �� ���� ����� ����(insert�� ����)

			// polynomial: polys�� ĭ �� �ϳ��� ĭ���� ����
			int i = nTerms - 1;  

			// ����(insert)
			while (i >= 0 && terms[i].exp < 0) {
				terms[i+1] = terms[i];
				i--;
			}

			// �Լ�name : _ _ _ _ -> ���� �ϳ��� Term Ÿ��������������
			terms[i+1] = new Term3(c, e);
			nTerms++;
		}
	}

	// e�� ���� �ִ��� ������ Ȯ��
	public int findTerm(int e) {
		// ���� ������ e���� �۾����ٸ�, �ڿ��Ŵ� �� �ʿ���� -> ������� ���ĵǾ��ֱ� ����
		for (int i = 0; i < nTerms; i++) {  // ó������ ���� Ȯ��
			if (terms[i].exp == e) {
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

}
