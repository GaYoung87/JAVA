import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// 소수이면 값 출력하는 프로그램

		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i < n; i++ ) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println(n);
		}
		
		keyboard.close();
	}

}
