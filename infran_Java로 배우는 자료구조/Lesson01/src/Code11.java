import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		// �������� n�� �Է¹ް�, n���� ������ �Է¹޾� ������� �迭�� ����
		// ex) n=6, 2 4 2 4 5 2 -> (2,2), (2,2), (2,2), (4,4) 4��
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();
		
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (data[i] == data[j])
					count++;
			}
		}
		
		System.out.println(count);
		
	}

}
