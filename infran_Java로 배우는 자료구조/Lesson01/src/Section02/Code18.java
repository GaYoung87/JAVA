package Section02;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		// n개의 정수를 입력받은 후 오름차순으로 정렬하여 출력하는 코드
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();
		
		bubbleSort(n, data);
		
		System.out.println("Sorted data: ");
		for (int i = 0; i < n ; i++) {
			System.out.println(data[i]);
		}
		
	}
	
	// n이 함수내부에 있어서 bubbleSort함수 내에서는 사용할 수 없음 -> 매개변수로 넘겨줌
	// void: 아무것도 리턴하지 않는다는 의미
	static void bubbleSort( int n, int [] data ) {  
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j+1]) {
					
					// data값 변경
					swap(data[j], data[j+1]);
					
				}
			} 
		}
		
//		return;  어떤값 돌려주는 역할 + 함수 실행 중단

	}
	
	// 호출문 swap에 대한 호출된 메서드
	// 이런경우 swap이 이루어지지 않음
	// swap메서드를 호출하는 순간 data[j], data[j+1]의 값이 각각 a,b에 복사됨
	// 따라서 완전 별개의 변수 -> swap에서는 a,b값을 변경하는것이므로 
	//                      data[j], data[j+1] 값은 변화없음
	// 값에 의한 호출
	
	// 프리미티브 타입은 호출된 메서드에서 값을 변경해도 호출한 쪽에 영향을 주지 못함
	// 프리미티브 타입이 아닌 경우(String, 배열 등)는 호출된 메서드에서 변경하면 호출한 쪽에서도 변경됨
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
