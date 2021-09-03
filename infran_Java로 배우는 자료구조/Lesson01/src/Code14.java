import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		// 버블정렬 알고리즘
		// 8 4 1 7 11 13 5 2 : 제일 큰 값을 맨 마지막 자리로 둔다
		// how? 8 4를 비교해서 4 8로 변경 / 8 1비교해서 1 8로 변경.. (나 vs 나 다음값 비교)
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
		
		// 가장 큰 값이 마지막으로 가면, 없는 값이라 생각하고 그 전까지만 확인하면 됨
		// 따라서 i(확인해야하는 마지막 위치) = n-1	
		for (int i = n-1; i > 0; i--) {
			// 가장 큰값을 맨 뒤로 보내기
			for (int j = 0; j < i; j++) {
				System.out.println("i: "+i+", j:"+j);
				if (data[j] > data[j+1]) {
					// 값 변경
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
