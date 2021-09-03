import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// n개의 정수를 입력받는다
		// 정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬해 출력하라.
		// ex) n=6, 1 3 9 4 5 7
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] data = new int[n];
		
		// 방법1. 입력된 값보다 큰거나 같은 값이 나오면 그 앞에 넣는다
		// 방법2. 입력된 값보다 작거나 같은 값이 나오면 그 뒤에 넣는다
		for (int i = 0; i < n; i++) {
			int val = keyboard.nextInt();
			int j = i-1;
			
			// 방법1
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
