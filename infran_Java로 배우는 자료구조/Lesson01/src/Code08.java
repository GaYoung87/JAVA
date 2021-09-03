import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// n개의 정수를 입력받아 순서대로 배열에 저장한다음 정수들을 한칸씩 오른쪽으로 이동
		// 마지막 정수는 배열의 첫번째 칸으로 이동
		
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
