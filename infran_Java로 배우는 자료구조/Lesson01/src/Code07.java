import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// ����ڷκ��� n���� ������ �Է¹��� �� �հ� �ִ밪�� ���� ����ϴ� �ڵ�
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++)
			data[i] = keyboard.nextInt();

		keyboard.close();

		int sum = 0, max = data[0];
		for (int i = 0; i < n; i++) {
			sum += data[i];
			if (data[i] > max) 
				max = data[i];
		}
		
		System.out.println("The sum is " + sum + " and the maximum is " + max);

	}

}
