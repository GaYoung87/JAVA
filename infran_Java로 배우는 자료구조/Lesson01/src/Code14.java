import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		// �������� �˰���
		// 8 4 1 7 11 13 5 2 : ���� ū ���� �� ������ �ڸ��� �д�
		// how? 8 4�� ���ؼ� 4 8�� ���� / 8 1���ؼ� 1 8�� ����.. (�� vs �� ������ ��)
		//      -> 4 1 7 8 11 5 2 13 -> 1 4 7 8 5 2 11 13
		//      -> 1 4 7 5 2 8 11 13 -> 1 4 5 2 7 8 11 13
		//      -> 1 4 5 2 7 8 11 13 -> 1 4 2 5 7 8 11 13
		//      -> 1 2 4 5 7 8 11 13
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();
		
		// ���� ū ���� ���������� ����, ���� ���̶� �����ϰ� �� �������� Ȯ���ϸ� ��
		// ���� i(Ȯ���ؾ��ϴ� ������ ��ġ) = n-1	
		for (int i = n-1; i > 0; i--) {
			// ���� ū���� �� �ڷ� ������
			for (int j = 0; j < i; j++) {
				System.out.println("i: "+i+", j:"+j);
				if (data[j] > data[j+1]) {
					// �� ����
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
//				System.out.println("Sorted data: ");
//				for (int k = 0; k < n ; k++) {
//					System.out.println(data[k]);
//				}
//				System.out.println("------------------------");
			}
		}
		
		System.out.println("Sorted data: ");
		for (int i = 0; i < n ; i++) {
			System.out.println(data[i]);
		}
		
	}

}
