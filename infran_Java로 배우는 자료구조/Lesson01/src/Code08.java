import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// n���� ������ �Է¹޾� ������� �迭�� �����Ѵ��� �������� ��ĭ�� ���������� �̵�
		// ������ ������ �迭�� ù��° ĭ���� �̵�
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++)
			data[i] = keyboard.nextInt();
		
		keyboard.close();
		
		int temp = data[n-1];
		for (int idx = n-2; idx >= 0; idx--) {
			data[idx+1] = data[idx];
		}
		data[0] = temp;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	

	}

}
