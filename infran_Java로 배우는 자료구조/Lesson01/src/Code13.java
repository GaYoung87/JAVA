import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		// n���� ���� �ƴ� ���ڸ� ������ �Է¹޾� �迭�� ����
		// �̵� �߿��� 1�� �̻��� ���ӵ� �������� ���� ���� �� �ִ� �Ҽ��� �� �ִ밪 ���ϱ�
		// n=10, 1 9 4 0 7 1 3 6 2 3 
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			
			int temp = 0;
			
			for (int j = i; j < n; j++) {
				temp = temp * 10 + data[j];
				
				// �Ҽ����� Ȯ��
				boolean isPrime = true;
				for (int k = 2; k <= temp/2 && isPrime; k++) {
					if (temp % k == 0) {
						isPrime = false;
					}
				
				}
				
				if (isPrime && temp > max && temp > 1) {
					max = temp;
				}

			}
		}
		
		if (max > 0) {
			System.out.println("Max: " + max);
		} else {
			System.out.println("No prime number");
		}

	}

}
