// ���� ���� �� �־��� Ÿ���� ������뵵�� ���� �Ұ�
// ����Ÿ��(byte, char, short, int, long) -> �޸�ũ��, �׿����� ���尡���� ���� ���� �ٸ�
// �ڹٴ� �⺻������ ���������� int Ÿ������ ����

public class DateTypeByte {
	public static void main(String[] args) {
		// Byte Ÿ��
		// ���� ������(��������, ����, �̹��� ��) ó���� �ַ� ���
		// -128 ~ 127ǥ��(1byte=8bite-> -2^7 ~ 2^7-1) -> �ʰ��ϴ� ���� ����Ǹ� compile error
		// �ֻ�����Ʈ�� �������� ��ȣ�� ���� -> 0�̸� ��������, 1�̸� ���� ����
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128;  // ������ ����!
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		// �ڵ忡�� ���������� ������ �ùٸ� ���� �����ϴ��� ���α׷��� �����ϴ� ���߿� ������ ���� �����
		// ���� ���� �߿� ������ �� �ִ� ���� ������ �ʰ��ϸ� �ּҰ����� �ٽ� �ݺ�����(byte: �ٽ� -128���� ����)
		// ���͸��� ���� = �����Ⱚ		
	}
}
