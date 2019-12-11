// �Ǽ� Ÿ�� : float�� double�� int�� long�� ũ��� ������ �� ū �� ���� ����
// + m * 10^n (m: ����(0<=m<1), n: ����)

// double: 1. ���� ���е��� ��� ����
//         2. �Ǽ��� �⺻ Ÿ�� -> float + F
public class DateTypeFloat {
	public static void main(String[] args) {
		// �Ǽ��� ����
		double var1 = 3.14;
		// float var2 = 3.14;  // Compile Error
		float var3 = 3.14F;
		
		// ���е� �׽�Ʈ
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		
		// JAVA�� "" ���ַ� ���!
	    // ''����ϸ� ���� ��! 
		System.out.println("var1: " + var1);  // var1: 3.14
		System.out.println("var3: " + var3);  // var3: 3.14
		System.out.println("var4: " + var4);  // var4: 0.12345678901234568
		System.out.println("var5: " + var5);  // var5: 0.12345679
		// var4�� var5�� ����: doubleŸ���� ���� bit���� floatŸ���� ���� bit������ �� �ι����� ŭ
		
		
		// e ����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6: " + var6);  // var6: 3000000
		System.out.println("var7: " + var7);  // var7: 3000000.0
		System.out.println("var8: " + var8);  // var7: 3000000.0
		System.out.println("var9: " + var9);  // var9: 0.002
	}
}
