package Section01;

public class Study02_Call_by_value {

	public static void main(String[] args) {
		// ���� ���� ȣ��: �迭
		
		int [] data = new int [100];
		int count = 0;
		
		bubbleSort(data, count);

	}
	
	// 1. ȣ���ϴ� ���� ���� data�� ���� ȣ��� �޼����� �Ű����� data2�� ����
	// 2. ���絵�� ���� �迭�� �ּ� -> data�� data2�� ������ �迭�� ����Ŵ
	// 3. �迭 data2�� ������ �����ϸ� data�� ���뵵 ����
	//    �迭�� �Ű������� �Ѱ��ְ� ȣ��� �޼��忡�� �迭�� ���� �����ϸ�, ������ ���� �����Ǵ� ����
	//    "���� ���� ȣ��"�� ���ܰ� �ƴ϶� �迭�� �̸��� ���������� ������ ������ ��
	public static void bubbleSort(int [] data2, int n) {
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (data2[j] > data2[j+1]) {
					
					// �� ����
					int temp = data2[j];
					data2[j] = data2[j+1];
					data2[j+1] = temp;
					
				}
			}

		}
	}

}
