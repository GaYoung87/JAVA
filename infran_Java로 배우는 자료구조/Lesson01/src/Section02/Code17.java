package Section02;

public class Code17 {

	public static void main(String[] args) {
		// 1 ~ 100000 ������ �Ҽ��� ã�� ���
		
		for (int i=2; i < 100000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static boolean isPrime(int k) {
		if (k < 2) {
			return false;
		}
		
		for (int i = 2; i < k/2; i ++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}

}
