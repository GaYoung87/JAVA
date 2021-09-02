import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		
		int number = 123;
		
		// keyboard -> 임의로 만든 변수명
		// System.in : 표준입력
		// 뭘 import해야할 지 모르는 경우 코드작성 후 클릭 or Ctrl+Shifh+O
		Scanner keyboard = new Scanner(System.in);  // 값을 입력받는방법
		
		System.out.print("Please enter an integer: ");
		
		int input = keyboard.nextInt();
		
		if (input == number) {
			System.out.print("Numbers match! :-)");
		} else {
			System.out.print("Numbers do not match! :-(");
		}
		
		// Scanner 시작하고 닫아주기 -> 안닫아도 실행문제는없지만
		keyboard.close();

	}

}
