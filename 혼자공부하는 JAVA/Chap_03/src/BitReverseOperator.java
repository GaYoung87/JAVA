//System.out.println(6); //Number(숫자)
//System.out.println('6');//char(문자)
//System.out.println("6");//String(문자열)

// 비트반전연산자는 정수타입의 피연산자에만 사용
// 모든 비트 반전되면 부호가 반대인 값 산출 -> 첫번째 비트값: 0=+, 1=-
// 비트연산자 산출 타입은 int타입



public class BitReverseOperator {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v1) + " (십진수: " + v1 + ")");  // 1010 (십진수: 10)
		System.out.println(Integer.toBinaryString(v2) + " (십진수: " + v2 + ")");  // 11111111111111111111111111110101 (십진수: -11)
		System.out.println(Integer.toBinaryString(v3) + " (십진수: " + v3 + ")");  // 11111111111111111111111111110110 (십진수: -10)
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		
		System.out.println(Integer.toBinaryString(v4) + " (십진수: " + v4 + ")");  // 11111111111111111111111111110110 (십진수: -10)
		System.out.println(Integer.toBinaryString(v5) + " (십진수: " + v5 + ")");  // 1001 (십진수: 9)
		System.out.println(Integer.toBinaryString(v6) + " (십진수: " + v6 + ")");  // 1010 (십진수: 10)
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
