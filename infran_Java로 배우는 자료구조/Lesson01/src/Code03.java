import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// String str = "Hello world";
		String str = "Hello";
		String input = null;  // 기본으로 넣어주는 값
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		
		input = keyboard.next();  // next는 입력한 첫번째 단어만 인식
		// str = "Hello world"하면 어떻게든 str == input 될 수 없음
		
		// ==연산자는 프리미티브타입만 사용가능! -> String사용불가
		// 프리미티브 타입: byte, short, int, long, float, double, char, boolean
		if (str.equals(input)) {  // input.equals(str)과 동일
			System.out.print("Strings match! :-)");
		} else {
			System.out.print("Strings do not match! :-(");
		}
		
		keyboard.close();
	}

}
