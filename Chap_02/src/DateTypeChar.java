
public class DateTypeChar {
	public static void main(String[] args) {
		// ���� ����
		char var1 = 'A';   // �����ڵ�: 0x0041 -> ������: 00000000 01000001 (65)
		char var11 = 65;   // 10������ ����
		char var12 = '\u0041';  // 16������ ����
		char var2 = 'B';   // �����ڵ�: 0x0042 -> ������: 00000000 01000001 (66)
		char var3 = '��';  // �����ڵ�: 0xAC00 -> ������: 10101100 00000000
		char var4 = '��';  // �����ڵ�: 0xAC01 -> ������: 10101100 00000001
		
		char c ='C';
		int uniCode = c;  // char������ ����� �����ڵ带 �˰�ʹٸ�, charŸ�� ������ int Ÿ�� ������ �����ϸ� ��
		
		
		//���ڿ� ����
		String name = "ȫ�浿";
		// String: 1. �⺻Ÿ���� �ƴ϶� Ŭ���� Ÿ��
		//         2. String������ ���� ����(���ڿ��� ���� ����X, String��ü�� �����ǰ�, String������ String��ü�� ������ ����)
		
		// �ܼ� �ʱ�ȭ
		char empty1 = ' ';  // pythonó�� ''�ϸ� Compile Error ���!
		String empty2 = ""; // String�� "" �̰� ok
		
		System.out.println(name);    // ȫ�浿
		System.out.println(empty1);  // ����
		System.out.println(empty2);  // ����
		System.out.println(var1);    // A
		System.out.println(var11);   // A
		System.out.println(var12);   // A
		System.out.println(var2);    // B
		System.out.println(var3);    // ��
		System.out.println(var4);    // ��
		System.out.println(c);       // C
		System.out.println(uniCode); // 67
		
		
	}

}
