import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// �Ҽ��̸� �� ����ϴ� ���α׷�

		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i < n; i++ ) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println(n);
		}
		
		keyboard.close();
	}

}
