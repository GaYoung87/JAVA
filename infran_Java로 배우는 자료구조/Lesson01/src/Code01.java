
public class Code01 {

	static int num;  // 함수 외부에 선언 -> 클래스 외부에 선언될 수 는 없음
	
	public static void main(String[] args) {
		
		int anotherNum = 5;  // 메서드 내부에 선언된 변수는 그 메서드 내에서만 사용 가능
		num = 2;  // 메서드 외부에 선언된 변수는 그 클래스 전체에서 사용될 수 있음
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("Sum: " + num + anotherNum);
		// left associativity(왼쪽먼저 계산됨) -> "Sum: " + num 이 계산되어 문자열 + 숫자(anotherNum)
		System.out.println("Sum: " + (num + anotherNum));
	}

}

// 변수는 데이터를 보관하는 장소
// 프리미티브 타입: byte, short, int, long, float, double, char, boolean
// String, 그 밖의 타입들
