// ���� Ÿ�� ��ȯ: ūũ�� Ÿ�� -> ���� ũ�� Ÿ��
public class Casting {
	public static void main(String[] args) {
		int intValue = 10302770;  // 00000110 00100100 00011100 00001010
		byte byteValue = (byte) intValue;  // 00001010
		System.out.println(byteValue);  // 50
		
		int intVal = 10;  // 00000000 00000000 00000000 00001010
		byte byteVal = (byte) intVal;  // 00001010
		System.out.println(byteVal);  // 10
		
		long longValue = 300;
		int intV = (int) longValue;  // intValue�� 300 �״�� ����
		System.out.println(intV);  // 300
		
		// int Ÿ���� charŸ������ �ڵ���ȯ ���� ����
		int intValue1 = 'A';
		char charValue = (char) intValue1;
		System.out.println(charValue);  // A
		System.out.println(intValue1);
		
	}

}
