import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// 정수개수 n을 입력받고, 이들 중에서 0개 이상의 연속된 정수들을 더해
		// 얻을 수 있는 최대값 구하기
		// ex) n=13, -2 3 5 -14 12 3 -9 8 -1 13 2 -5 4
		//                      <------28------->
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = keyboard.nextInt();
		}
		keyboard.close();

		int maxSum = 0;
		for (int i = 0; i < n; i++) {  // i: 시작점
			for (int j = i; j < n ; j++) {  // j: 끝점
				
				int sum = 0;
				
				for (int k = i; k <= j; k++) {
					sum += data[k];
				}
				
				if (sum > maxSum) {
					maxSum = sum;
				}
				
			}
		}
		
		System.out.println("The max sum is " + maxSum);
	}

}
