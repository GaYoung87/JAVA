
public class Code01 {

	static int num;  // �Լ� �ܺο� ���� -> Ŭ���� �ܺο� ����� �� �� ����
	
	public static void main(String[] args) {
		
		int anotherNum = 5;  // �޼��� ���ο� ����� ������ �� �޼��� �������� ��� ����
		num = 2;  // �޼��� �ܺο� ����� ������ �� Ŭ���� ��ü���� ���� �� ����
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("Sum: " + num + anotherNum);
		// left associativity(���ʸ��� ����) -> "Sum: " + num �� ���Ǿ� ���ڿ� + ����(anotherNum)
		System.out.println("Sum: " + (num + anotherNum));
	}

}

// ������ �����͸� �����ϴ� ���
// ������Ƽ�� Ÿ��: byte, short, int, long, float, double, char, boolean
// String, �� ���� Ÿ�Ե�
