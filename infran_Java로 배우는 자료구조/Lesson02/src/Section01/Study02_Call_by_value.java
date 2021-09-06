package Section01;

public class Study02_Call_by_value {

	public static void main(String[] args) {
		// 값에 의한 호출: 배열
		
		int [] data = new int [100];
		int count = 0;
		
		bubbleSort(data, count);

	}
	
	// 1. 호출하는 순간 변수 data의 값이 호출된 메서드의 매개변수 data2로 복사
	// 2. 복사도니 값은 배열의 주소 -> data와 data2는 동일한 배열을 가리킴
	// 3. 배열 data2의 내용을 변경하면 data의 내용도 변경
	//    배열을 매개변수로 넘겨주고 호출된 메서드에서 배열의 값을 수정하면, 원본의 값도 수정되는 것은
	//    "값에 의한 호출"의 예외가 아니라 배열의 이름이 참조변수기 때문에 벌어진 것
	public static void bubbleSort(int [] data2, int n) {
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (data2[j] > data2[j+1]) {
					
					// 값 변경
					int temp = data2[j];
					data2[j] = data2[j+1];
					data2[j+1] = temp;
					
				}
			}

		}
	}

}
