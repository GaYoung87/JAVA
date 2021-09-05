package Section02;
import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		// 음이아닌 두 정수 a와 b를 받아 a의 b승을 계산한다.
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two integers and press Enter.");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		// 
		int result = power(a, b);
		System.out.println("The result is " + result);
		keyboard.close();

	}
	
	// python에서 함수만들기
	public static int power(int n, int m) {
		int result = 1;
		for(int i = 0; i < m; i++) {
			result *= n;
		}
		
		return result;
	}

}
