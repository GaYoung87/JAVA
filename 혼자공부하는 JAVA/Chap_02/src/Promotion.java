// �ڵ� Ÿ�� ��ȯ: ���� ũ�⸦ ������ Ÿ���� ū ũ�⸦ ������ Ÿ�Կ� ����� �� �߻�
// ũ�⺰�� Ÿ�� ����: bype(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class Promotion {
	public static void main(String[] args) {
		// �ڵ� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue;  // byte -> int: �ڵ� Ÿ�� ��ȯ �߻�
		System.out.println(intValue);  // 10
		
		int intVal = 200;
		double doubleVal = intVal;  // int -> double
		System.out.println(doubleVal);  // 200.0
		
		char charValue = '��';
		intValue = charValue;  // char -> int
		System.out.println("���� �����ڵ�=" + intValue);  // ���� �����ڵ�=44032
		
		intValue = 500;
		long longValue = intValue;  // int -> long
		System.out.println(longValue);  // 500	
		
	}
}
