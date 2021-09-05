import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// n���� ������ �Է¹޴´�
		// ������ �ϳ��� �Էµ� ������ ������� �Էµ� �������� ������������ ������ ����϶�.
		// ex) n=6, 1 3 9 4 5 7
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		// ���1. �Էµ� ������ ū�ų� ���� ���� ������ �� �տ� �ִ´�
		// ���2. �Էµ� ������ �۰ų� ���� ���� ������ �� �ڿ� �ִ´�
		for (int i = 0; i < n; i++) {
			int val = keyboard.nextInt();
			int j = i-1;
			
			// ���1
			while (j >= 0 && data[j] > val) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = val;
			
			for (int k=0; k <= i; k++) {
				System.out.print(data[k] + " ");
			System.out.println();
			}
			
		}
		keyboard.close();
	}

}
