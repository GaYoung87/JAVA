//System.out.println(6); //Number(����)
//System.out.println('6');//char(����)
//System.out.println("6");//String(���ڿ�)

// ��Ʈ���������ڴ� ����Ÿ���� �ǿ����ڿ��� ���
// ��� ��Ʈ �����Ǹ� ��ȣ�� �ݴ��� �� ���� -> ù��° ��Ʈ��: 0=+, 1=-
// ��Ʈ������ ���� Ÿ���� intŸ��



public class BitReverseOperator {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v1) + " (������: " + v1 + ")");  // 1010 (������: 10)
		System.out.println(Integer.toBinaryString(v2) + " (������: " + v2 + ")");  // 11111111111111111111111111110101 (������: -11)
		System.out.println(Integer.toBinaryString(v3) + " (������: " + v3 + ")");  // 11111111111111111111111111110110 (������: -10)
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(Integer.toBinaryString(v4) + " (������: " + v4 + ")");  // 11111111111111111111111111110110 (������: -10)
		System.out.println(Integer.toBinaryString(v5) + " (������: " + v5 + ")");  // 1001 (������: 9)
		System.out.println(Integer.toBinaryString(v6) + " (������: " + v6 + ")");  // 1010 (������: 10)
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
