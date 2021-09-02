
public class DateTypeChar {
	public static void main(String[] args) {
		// 문자 저장
		char var1 = 'A';   // 유니코드: 0x0041 -> 이진수: 00000000 01000001 (65)
		char var11 = 65;   // 10진수로 저장
		char var12 = '\u0041';  // 16진수로 저장
		char var2 = 'B';   // 유니코드: 0x0042 -> 이진수: 00000000 01000001 (66)
		char var3 = '가';  // 유니코드: 0xAC00 -> 이진수: 10101100 00000000
		char var4 = '각';  // 유니코드: 0xAC01 -> 이진수: 10101100 00000001
		
		char c ='C';
		int uniCode = c;  // char변수에 저장된 유니코드를 알고싶다면, char타입 변수를 int 타입 변수에 저장하면 됨
		
		
		//문자열 저장
		String name = "홍길동";
		// String: 1. 기본타입이 아니라 클래스 타입
		//         2. String변수는 참조 변수(문자열에 직접 저장X, String객체가 생성되고, String변수는 String객체의 번지를 참조)
		
		// 단순 초기화
		char empty1 = ' ';  // python처럼 ''하면 Compile Error 뜬다!
		String empty2 = ""; // String은 "" 이거 ok
		
		System.out.println(name);    // 홍길동
		System.out.println(empty1);  // 공백
		System.out.println(empty2);  // 공백
		System.out.println(var1);    // A
		System.out.println(var11);   // A
		System.out.println(var12);   // A
		System.out.println(var2);    // B
		System.out.println(var3);    // 가
		System.out.println(var4);    // 각
		System.out.println(c);       // C
		System.out.println(uniCode); // 67
		
		
	}

}
