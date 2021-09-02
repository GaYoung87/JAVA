// 변수 선언 시 주어진 타입은 변수사용도중 변경 불가
// 정수타입(byte, char, short, int, long) -> 메모리크기, 그에따른 저장가능한 값의 범위 다름
// 자바는 기본적으로 정수연산을 int 타입으로 수행

public class DateTypeByte {
	public static void main(String[] args) {
		// Byte 타입
		// 이진 데이터(색상정보, 파일, 이미지 등) 처리시 주로 사용
		// -128 ~ 127표현(1byte=8bite-> -2^7 ~ 2^7-1) -> 초과하는 값이 저장되면 compile error
		// 최상위비트는 정수값의 부호를 결정 -> 0이면 양의정수, 1이면 음의 정수
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128;  // 컴파일 에러!
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		// 코드에서 정상적으로 변수에 올바른 값을 저장하더라도 프로그램이 실행하는 도중에 변수의 값은 변경됨
		// 만약 실행 중에 저장할 수 있는 값의 범위를 초과하면 최소값부터 다시 반복저장(byte: 다시 -128부터 시작)
		// 엉터리값 저장 = 쓰레기값		
	}
}
